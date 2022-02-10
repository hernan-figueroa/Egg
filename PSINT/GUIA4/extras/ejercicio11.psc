//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario),
//llenarla con números aleatorios entre 1 y 100 y mostrar su traspuesta. NOTA: si no
//	conoces lo que es una traspuesta, mirar el siguiente link: Matriz Traspuesta


Algoritmo ejercicio11
	Definir n,m Como Entero
	Escribir "Ingrese el valor de filas y columnas"
	Leer n,m
	
	Dimension mat(n,m)
	Definir mat,matT Como Entero
	llenarMatriz(mat,n,m)
	mostrarMatriz(mat,n,m)
	Escribir "La transpuesta es:"
	mostrarMatrizTranspuesta(mat,m,n)
	
FinAlgoritmo

SubProceso llenarMatriz(mat,n,m)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			mat(i,j)=Aleatorio(0,9)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(mat,n,m)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso

SubProceso mostrarMatrizTranspuesta(mat,n,m)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			Escribir mat(j,i) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso