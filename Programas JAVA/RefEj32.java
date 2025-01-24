Programa: RefEj32
Autor: Francisco Mejias
Entorno:
	numero,subNumero,numeroInvertido numérico entero
Algoritmo:
	Escribir "Número: "
	Leer numero
	numeroInvertido <-- 0
	digitos <-- 0
	Repetir
		subNumero <-- numero \ 10
		digitos <-- digitos + 1
	Hasta subNumero = 0 
	Repetir
		numeroInvertido <-- numero mod 10 + 10**(digito -1) + numeroInvertido
		digito <-- digito - 1
		numero <-- numero \ 10 
	Hasta digito = 0
	numeroInvertido <-- numeroInvertido - 1
	Escribir numeroInvertido
Fin Programa