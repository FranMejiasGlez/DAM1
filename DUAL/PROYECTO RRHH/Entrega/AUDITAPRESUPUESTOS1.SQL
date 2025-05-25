--Disparador 2 de la vista DEPART-PRESUPUESTO que controle:

--Todos los los dept tienen que tener presupuesto.

--El presupuesto tiene que ser mayor o igual que el gasto salarial

CREATE OR REPLACE TRIGGER AUDITA_PRESUPUESTOS
BEFORE INSERT OR UPDATE OR DELETE ON PRESUPUESTOS
FOR EACH ROW
DECLARE
   gasto_salarial NUMBER;
   dept_sin_presupuesto NUMBER;
   presupuesto_minimo NUMBER;
BEGIN
    -- Para INSERT/UPDATE: Controlar relación presupuesto-gasto salarial
    IF INSERTING OR UPDATING THEN
        -- 1. Calcular el gasto salarial del departamento (14 pagas)
        SELECT NVL(SUM(e.SALARIO * 14), 0)
        INTO total_salarios
        FROM EMPLEADOS e
        WHERE e.DEPT_NO = :NEW.DEPT_NO;
        -- 2. Calcular el presupuesto mínimo requerido (doble del gasto salarial)
        presupuesto_minimo := total_salarios * 14 *  2

        -- 3. Validar que el presupuesto asignado cumple con el mínimo
        IF :NEW.CANTIDAD < presupuesto_minimo THEN
        RAISE_APPLICATION_ERROR(-20020, 
            'Presupuesto insuficiente para el departamento ' || :NEW.DEPT_NO || CHR(10) ||
            'Gasto salarial anual: ' || total_salarios || CHR(10) ||
            'Presupuesto mínimo requerido (2x): ' || presupuesto_minimo || CHR(10) ||
            'Presupuesto asignado: ' || :NEW.CANTIDAD);
        END IF;
    END IF;
    
    -- Después de cualquier cambio: Verificar que todos los dept tengan presupuesto
    IF INSERTING OR UPDATING OR DELETING THEN
        
        FOR dept_rec IN (
            SELECT d.DEPT_NO
            FROM DEPART d
            WHERE NOT EXISTS (
                SELECT 1 
                FROM PRESUPUESTOS p 
                WHERE p.DEPT_NO = d.DEPT_NO
                AND p.AÑO = TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'))
            )
        ) LOOP
            RAISE_APPLICATION_ERROR(-20011, 
                'El departamento ' || dept_rec.DEPT_NO || 
                ' no tiene presupuesto para el año actual');
        END LOOP;
    END IF;
END;
/

