//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.
//

Algoritmo ejercicio13
	Dimension mat1(3,3),mat2(3,3)
	Definir mat1,mat2 Como Entero
	llenarMatriz(mat1,3)
	mostrarMatriz(mat1,3)
	Escribir "------------"
	llenarMatriz(mat2,3)
	mostrarMatriz(mat2,3)
	Escribir "------------"
	multipicarMatrices(mat1,mat2,3)
	
FinAlgoritmo
SubProceso llenarMatriz(mat,tam)
	Definir i,j Como Entero
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta tam-1 Hacer
			mat(i,j)=Aleatorio(1,3)
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

SubProceso multipicarMatrices(mat1,mat2,tam)
	Definir i,j Como Entero
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta tam-1 Hacer
			Escribir mat1(i,j)*mat2(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso