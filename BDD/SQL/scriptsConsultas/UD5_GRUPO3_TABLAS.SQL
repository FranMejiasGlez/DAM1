REM ********** TABLA NOMBRES: ***********


CREATE TABLE NOMBRES
(
  NOMBRE VARCHAR2(15),
  EDAD NUMBER(2)
) ;

INSERT INTO NOMBRES VALUES('PEDRO', 17);
INSERT INTO NOMBRES VALUES('JUAN', 17);
INSERT INTO NOMBRES VALUES('MAR�A', 16);
INSERT INTO NOMBRES VALUES('CLARA', 14);
INSERT INTO NOMBRES VALUES(NULL, 15);
INSERT INTO NOMBRES VALUES(NULL, 18);
INSERT INTO NOMBRES VALUES('JES�S', NULL);

COMMIT;

REM ********** TABLA MISTEXTOS: *************



CREATE TABLE MISTEXTOS (
 TITULO  VARCHAR2(32),
 AUTOR   VARCHAR2(22),
 EDITORIAL VARCHAR2(15), 
 PAGINA  NUMBER(3)
 ) ;

INSERT INTO MISTEXTOS VALUES ('METODOLOG�A DE LA PROGRAMACI�N.', 
'ALCALDE, GARC�A', 'MCGRAWHILL',140);
INSERT INTO MISTEXTOS VALUES ('"INFORM�TICA B�SICA."', 'GARC�A GARCER�N', 'PARANINFO',130);
INSERT INTO MISTEXTOS VALUES ('SISTEMAS OPERATIVOS', 'J.F. GARC�A', 'OBSBORNE',300);
INSERT INTO MISTEXTOS VALUES ('SISTEMAS DIGITALES.', 'M.A. RU�Z', 
'PRENTICE HALL',190);
INSERT INTO MISTEXTOS VALUES ('"MANUAL DE C."', 'M.A. RU�Z', 'MCGRAWHILL',340);

COMMIT;


REM ********** TABLA LIBROS: *************



CREATE TABLE LIBROS (
 TITULO  VARCHAR2(32),
 AUTOR   VARCHAR2(22),
 EDITORIAL VARCHAR2(15), 
 PAGINA  NUMBER(3)
 ) ;

INSERT INTO LIBROS VALUES ('LA COLMENA', 'CELA, CAMILO JOS�', 'PLANETA',240);
INSERT INTO LIBROS VALUES ('LA HISTORIA DE MI HIJO', 'GORDIMER, NADINE', 'TIEM.MODERNOS',327);
INSERT INTO LIBROS VALUES ('LA MIRADA DEL OTRO', 'G.DELGADO, FERNANDO', 'PLANETA',298);
INSERT INTO LIBROS VALUES ('�LTIMAS TARDES CON TERESA','MARSE, JUAN', 'C�RCULO',350);
INSERT INTO LIBROS VALUES ('LA NOVELA DE P. ANSUREZ', 
'TORRENTE B., GONZALO', 'PLANETA',162);
COMMIT;

REM ********** TABLA NACIMIENTOS:******************

ALTER SESSION SET NLS_DATE_FORMAT='DD/MM/YYYY';

CREATE TABLE NACIMIENTOS (
 NOMBRE CHAR(15),
 APELLIDO CHAR(15),
 FECHANAC DATE,
 EDAD NUMBER
 ) ;


INSERT INTO NACIMIENTOS VALUES ('PEDRO', 'S�NCHEZ','12/05/1982', 17);
INSERT INTO NACIMIENTOS VALUES ('JUAN', 'JIM�NEZ','23/08/1982', 17);
INSERT INTO NACIMIENTOS VALUES ('MAR�A', 'L�PEZ','02/02/1983', 16);
INSERT INTO NACIMIENTOS VALUES ('CLARA', 'LASECA','20/05/1985', 14);
COMMIT;


REM ********** FIN *************************