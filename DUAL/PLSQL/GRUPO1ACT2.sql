DECLARE
 num NUMBER;
BEGIN
 SELECT COUNT(*) INTO num
 FROM PRODUCTOS;
 DBMS_OUTPUT.PUT_LINE(num);
END;
/
