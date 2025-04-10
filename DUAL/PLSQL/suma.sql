SET SERVEROUTPUT ON;
CREATE OR REPLACE
  PROCEDURE suma(num1 IN NUMBER,num2 IN NUMBER)
  IS
    resultado NUMBER(6);
  BEGIN
      resultado:=num1+num2;
      DBMS_OUTPUT.PUT_LINE('La suma es: ' || resultado);
	END suma;
/

