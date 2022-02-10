//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el
//usuario y los muestre por pantalla.
//
Algoritmo ejercicio08
	Dimension mat(3,3)
	Definir mat,i,j Como Entero
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir "Ingrese un numero "
			Leer mat(i,j)
		FinPara
	FinPara
	
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo
