//. Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de
//cómo se realiza la multiplicación entre matrices consultar el siguiente link: 
//


Algoritmo ejercicio15
	Dimension mat(3,3),vec(3)
	Definir mat, vec Como Entero
	llenarMatriz(mat)
	mostrarMatriz(mat)
	Escribir "--------------"
	llenarVector(vec)
	mostrarVector(vec)
	Escribir "--------------"
	multiplicaMatVec(mat,vec)
	
FinAlgoritmo

SubProceso llenarMatriz(mat)
	Definir i,j Como Entero
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			mat(i,j)=Aleatorio(1,3)
		FinPara
	FinPara
FinSubProceso

SubProceso llenarVector(vec)
	Definir i,j Como Entero
	para i=0 Hasta 2 Hacer
		vec(i)=Aleatorio(1,3)
	FinPara
FinSubProceso

SubProceso mostrarMatriz(mat)
	Definir i,j Como Entero
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso	
SubProceso mostrarVector(vec)
	Definir i,j Como Entero
	para i=0 Hasta 2 Hacer
		Escribir vec(i) 
	FinPara
FinSubProceso	

SubProceso multiplicaMatVec(mat,vec)
	Definir i,j,total Como Entero

	para i=0 Hasta 2 Hacer
		total=0
		para j=0 Hasta 2 Hacer
			total= total + mat(i,j)*vec(i)
		FinPara
		Escribir total
	FinPara
FinSubProceso	