El diseño de la estructura de XSD se basa en la siguiente estructura:

Como elemento padre tenemos Usuarios, cuyos elementos hijos seran: Usuario y como hijos de estos
y al mismo nivel seran los campos de cada Usuario:
-NombreCompleto
-CorreoElectronico
-Telefono
-DNI
-FechaDeNacimiento

En la validacion del NombreCompleto tenemos la siguiente Regex:
[A-Za-z]+\s[A-Za-z]+\s[A-Za-z]+ --> nos controla que el nombre completo
conste de 3 palabaras, es este caso nombre, apellidos1, apellidos2.

En la validacion del CorreoElectronico tenemos lo siguiente:
\S+@\S+\.\S+ --> Es una validacion simple comun que no permite
espacios y tiene que tener un punto y una @

En la validacion del Telefono tenemos lo siguiente:
[6-9][0-9]{8} --> numeros que empiezan entre 6 y 9 y tienen 9 digitos.

En la validacion del DNI tenemos lo siguiente:
\d{8}[A-HJ-NP-TV-Z] --> 9 Digitos y una letra mayuscula entre esos rangos.

En la validacion de la FechaDeNacimiento quisiera haber puesto esto 
[0-9][0-9][0-9][0-9]\/[0-1][0-2]\/[0-3][0-1]|[0-2][0-9] --> No es correcta al parecer.