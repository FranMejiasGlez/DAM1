--Disparador 3 de la tabla PRESUPUESTO que controle:

--El presupuesto solo puede modificarse anualmente.
CREATE OR REPLACE TRIGGER AUDITA_CAMBIO_PRESUPUESTO
BEFORE UPDATE OF CANTIDAD ON PRESUPUESTOS
FOR EACH ROW
DECLARE
    anio_actual NUMBER;
BEGIN
    -- Obtener el año actual
    anio_actual := TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY'));
    
    -- Verificar si el presupuesto que se intenta modificar es del año actual
    IF :OLD.AÑO != anio_actual THEN
        RAISE_APPLICATION_ERROR(-20030, 
            'Solo se puede modificar el presupuesto del año actual (' || 
            anio_actual || '). Intenta modificar el año ' || :OLD.AÑO);
    END IF;
END;
/