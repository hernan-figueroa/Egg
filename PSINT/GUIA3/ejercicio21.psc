//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta
//		entre las letras "M" y "T". Recordar que Pseint le da un valor num�rico a cada letra a 
//		12
//		trav�s del C�digo Ascii, lo que nos deja usar operadores relacionales con letras y
//		cadenas.


Algoritmo ejercicio21
	Definir letra Como Caracter
	Escribir "Escriba una letra"
	Leer letra
	
	buscaLetra(letra)
	
FinAlgoritmo

SubProceso buscaLetra(letra)	
	si letra>="m" y letra<="t"
		Escribir "La letra esta entre m y n"
	FinSi
	
FinSubProceso
	