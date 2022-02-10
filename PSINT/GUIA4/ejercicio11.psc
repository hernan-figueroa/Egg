//1. Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la
//	diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe
//	generar otro subproceso para imprimir la matriz.


Algoritmo ejercicio11
	Definir num Como Entero
	Escribir "Ingrese un num"
	Leer num
	Dimension mat(num,num)
	Definir mat Como Entero
	llenarMat(mat,num)
	mostrarMatriz(mat,num)
	
FinAlgoritmo

SubProceso llenarMat(mat,num)
	Definir i,j Como Entero
	para i=0 Hasta num-1 Hacer
		para j=0 Hasta num-1 Hacer
			si i==j Entonces
				mat(i,j)=0
			SiNo
				mat(i,j)=Aleatorio(0,10)
			FinSi
		FinPara
	FinPara	
FinSubProceso
	
SubProceso mostrarMatriz(mat,num)
	Definir i,j Como Entero
	para i=0 Hasta num-1 Hacer
		para j=0 Hasta num-1 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
	
	
FinSubProceso
	