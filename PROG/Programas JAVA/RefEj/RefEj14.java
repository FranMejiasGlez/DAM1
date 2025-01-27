Programa: RefEj14
Autor: Francisco Mejias
Entorno:
	numeroBinario,numero,resto,i es numérico entero
Algoritmo:
	Escribir "Numero Binario: "
	Leer numeroBinario
	i<--0
	numero <-- 0
	Repetir 
		resto <-- numeroBinario mod 10
		numeroBinario <-- numeroBinario\10
		numero <-- numero + resto*2**i
		i <-- i+1
	Hasta numeroBinario = 0
	Escribir numeroBinario,"en binario es: ",numero
Fin Programa