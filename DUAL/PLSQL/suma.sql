CREATE OR REPLACE
  PROCEDURE suma(num1,num2)
  IS
    suma NUMBER;
  BEGIN
      suma:=num1+num2;
      DBMS_OUTPUT.PUT_LINE(suma);
/
