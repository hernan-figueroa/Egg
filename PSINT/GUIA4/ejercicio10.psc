//. Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario)
//realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos
//otro subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar
//la matriz y los resultados por pantalla. 
//

Algoritmo ejercicio10
	Definir n, m Como Entero
	Escribir "Ingrese n y m"
	Leer n, m

	Dimension mat(n,m)
	Definir mat Como Entero
	llenarMat(mat,n,m)
	Escribir "La suma total es: " sumaMatriz(mat,n,m)
	
FinAlgoritmo

SubProceso llenarMat(mat,n,m)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			mat(i,j)=Aleatorio(0,10)
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara	
FinSubProceso

Funcion suma<- sumaMatriz(mat,n,m) 
	Definir suma,i,j Como Entero
	suma=0
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			suma=suma+mat(i,j)
		FinPara
	FinPara
	
FinFuncion
	