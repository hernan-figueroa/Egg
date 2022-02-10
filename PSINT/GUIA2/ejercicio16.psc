//Dada una secuencia de números ingresados por teclado que finaliza con un ?1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,??,-1; realizar un programa que calcule el promedio de los
//	números ingresados. Suponemos que el usuario no insertará número negativos.

Algoritmo ejercicio16
	
	Definir num, suma, contador Como Entero
	suma = 0
	contador = 0
	Escribir "Ingrese un numero"
	Leer num
	
	Mientras num <> -1
		suma = suma + num
		contador = contador + 1
		Escribir "Ingrese un numero"
		Leer num
		
	FinMientras
	
	Escribir "El primedio es: " suma/contador
	
	
	
FinAlgoritmo
