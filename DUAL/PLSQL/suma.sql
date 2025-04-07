CREATE OR REPLACE
  PROCEDURE suma(num1 IN,num2 IN)
  IS
    suma NUMBER;
  BEGIN
      suma:=num1+num2;
      DBMS_OUTPUT.PUT_LINE(suma);
	END
