//Escriba un programa que valide si una nota est� entre 0 y 10, sino est� entre 0 y 10 la
//		nota se pedir� de nuevo hasta que la nota sea correcta.

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
