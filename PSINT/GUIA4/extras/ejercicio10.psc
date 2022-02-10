//Realizar un programa que rellene de números aleatorios una matriz a través de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo ejercicio10
	Definir tam Como Entero
	Escribir "Ingrese un tamanio de la matriz"
	leer tam
	
	Dimension mat(tam,tam)
	Definir mat Como Entero
	llenarMatriz(mat,tam)
	mostrarMatriz(mat,tam)
	
FinAlgoritmo

SubProceso llenarMatriz(mat,tam)
	Definir i,j Como Entero
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta tam-1 Hacer
			mat(i,j)=Aleatorio(0,10)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(mat,tam)
	Definir i,j Como Entero
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta tam-1 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso