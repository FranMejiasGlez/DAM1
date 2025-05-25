--Disparador 1 de la vista EMPLEADOS que controle:

--Solo un empleado que es su propio jefe.

--Empleado no puede cambiar de cargo o dept.

--Máximo un coordinador por dept.


CREATE OR REPLACE TRIGGER AUDITA_EMPLEADOS
BEFORE INSERT OR UPDATE OF OFICIO, DEPT_NO ON EMPLEADOS
FOR EACH ROW
DECLARE
    es_jefe_supremo NUMBER;
    coordinador_existente NUMBER;
    tiene_cargo_especial NUMBER;
    es_su_propio_jefe NUMBER;
BEGIN
    -- 1. Control: Solo un empleado puede ser su propio jefe (jefe supremo)
    -- Verificar si este empleado es su propio jefe
    BEGIN
        SELECT 1 INTO es_su_propio_jefe
        FROM DIR
        WHERE EMP_NO_EMPLEADO = :NEW.EMP_NO
        AND EMP_NO_JEFE = :NEW.EMP_NO;
        
        -- Si es su propio jefe, verificar que no haya otro jefe supremo
        SELECT COUNT(*) INTO es_jefe_supremo
        FROM DIR
        WHERE EMP_NO_EMPLEADO = EMP_NO_JEFE
        AND EMP_NO_EMPLEADO != :NEW.EMP_NO;
        
        IF es_jefe_supremo > 0 THEN
            RAISE_APPLICATION_ERROR(-20001, 'Ya existe un jefe supremo en la organización');
        END IF;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            es_su_propio_jefe :=0; -- No es su propio jefe
    END;

    -- 2. Control: Máximo un coordinador por departamento
    IF (:NEW.OFICIO = 'COORDINADOR') AND 
       (INSERTING OR (UPDATING AND (:OLD.OFICIO != 'COORDINADOR' OR :OLD.DEPT_NO != :NEW.DEPT_NO))) THEN
        SELECT COUNT(*) INTO coordinador_existente
        FROM EMPLEADOS_EMPRESA
        WHERE DEPT_NO = :NEW.DEPT_NO
        AND OFICIO = 'COORDINADOR'
        AND EMP_NO != NVL(:OLD.EMP_NO, 0);
        
        IF coordinador_existente > 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Ya existe un coordinador en el departamento ' || :NEW.DEPT_NO);
        END IF;
    END IF;

    -- 3. Control: Empleados con cargo no pueden cambiar de cargo ni departamento
    IF UPDATING THEN
        -- Verificar si tenía un cargo especial antes
        SELECT COUNT(*) INTO tiene_cargo_especial
        FROM EMPLEADOS_EMPRESA
        WHERE EMP_NO = :OLD.EMP_NO
        AND OFICIO IN ('COORDINADOR', 'TESORERO');
        
        IF tiene_cargo_especial > 0 THEN
            -- No puede cambiar de cargo
            IF :NEW.OFICIO != :OLD.OFICIO THEN
                RAISE_APPLICATION_ERROR(-20003, 'Empleados con cargo (' || :OLD.OFICIO || ') no pueden cambiar de cargo');
            END IF;
            
            -- No puede cambiar de departamento
            IF :NEW.DEPT_NO != :OLD.DEPT_NO THEN
                RAISE_APPLICATION_ERROR(-20004, 'Empleados con cargo (' || :OLD.OFICIO || ') no pueden cambiar de departamento');
            END IF;
        END IF;
    END IF;
  END;
/


