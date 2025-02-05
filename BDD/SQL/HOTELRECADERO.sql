
SQL*Plus: Release 8.1.7.0.0 - Production on Mié Feb 5 16:49:07 2025

(c) Copyright 2000 Oracle Corporation.  All rights reserved.

Conectado.

Tabla creada.


Tabla creada.


Tabla creada.

CREATE TABLE CLIENTES(
             *
ERROR en línea 1:
ORA-00955: este nombre ya está siendo usado por otro objeto existente



Tabla creada.


Tabla creada.

	CONSTRAINT FK_INCIDENCIAS_CLIENTES FOREIGN KEY (DNI)
	                                                *
ERROR en línea 13:
ORA-02267: tipo de columna incompatible con tipo de columna referida


 Nombre                                    ¿Nulo?   Tipo
 ----------------------------------------- -------- ----------------------------
 DNI                                       NOT NULL NUMBER(9)
 DIRECCION                                 NOT NULL VARCHAR2(30)
 POBLACION                                 NOT NULL VARCHAR2(20)
 PROVINCIA                                 NOT NULL VARCHAR2(20)
 CODIGO_POSTAL                             NOT NULL VARCHAR2(5)
 EMAIL                                     NOT NULL VARCHAR2(30)

DROP TABLE CLIENTES
           *
ERROR en línea 1:
ORA-02449: claves ajenas hacen referencia a las claves única/primaria de la
tabla


DROP TABLE INCIDENCIAS
           *
ERROR en línea 1:
ORA-00942: la tabla o vista no existe



Tabla borrada.


Tabla borrada.

DROP TABLE CLIENTES
           *
ERROR en línea 1:
ORA-02449: claves ajenas hacen referencia a las claves única/primaria de la
tabla



Tabla borrada.


Tabla borrada.


Tabla borrada.

DROP TABLE CLIENTES
           *
ERROR en línea 1:
ORA-02449: claves ajenas hacen referencia a las claves única/primaria de la
tabla


ERROR:
ORA-04043: el objeto HABITACIONES no existe


ERROR:
ORA-04043: el objeto PRECIOS no existe


 Nombre                                    ¿Nulo?   Tipo
 ----------------------------------------- -------- ----------------------------
 DNI                                       NOT NULL NUMBER(9)
 DIRECCION                                 NOT NULL VARCHAR2(30)
 POBLACION                                 NOT NULL VARCHAR2(20)
 PROVINCIA                                 NOT NULL VARCHAR2(20)
 CODIGO_POSTAL                             NOT NULL VARCHAR2(5)
 EMAIL                                     NOT NULL VARCHAR2(30)

ERROR:
ORA-04043: el objeto TEMPORADAS no existe


ERROR:
ORA-04043: el objeto TIPOS no existe


ERROR:
ORA-04043: el objeto PAISES no existe


ALTER TABLE INCIDENCIAS DROP CONSTRAINT FK_INCIDENCIAS_CLIENTES
*
ERROR en línea 1:
ORA-00942: la tabla o vista no existe



CONSTRAINT_NAME                TABLE_NAME
------------------------------ ------------------------------
FK_ANUNCIOS_CLIENTES           ANUNCIOS

DROP TABLE ANUNCIOS
           *
ERROR en línea 1:
ORA-02449: claves ajenas hacen referencia a las claves única/primaria de la
tabla


DROP TABLE WEB
           *
ERROR en línea 1:
ORA-00942: la tabla o vista no existe


DROP TABLE WEBS
           *
ERROR en línea 1:
ORA-02449: claves ajenas hacen referencia a las claves única/primaria de la
tabla



Tabla borrada.


Tabla borrada.


Tabla borrada.


Tabla borrada.


Tabla borrada.

DROP TABLE CLIENTES
           *
ERROR en línea 1:
ORA-00942: la tabla o vista no existe



Tabla creada.


Tabla creada.


Tabla creada.


Tabla creada.


Tabla creada.


Tabla creada.


Tabla creada.

