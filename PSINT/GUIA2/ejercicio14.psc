//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la
//		nota se pedirá de nuevo hasta que la nota sea correcta.

Algoritmo ejercicio14
	Definir nota Como Entero
	
	Escribir "Ingrese una nota"
	Leer nota
	
	Mientras nota <0 o nota >10
		
		Escribir "Escriba una nota entre 0 y 10"
		leer nota
		
	FinMientras
	
	Escribir "La nota es correcta"
	
FinAlgoritmo
