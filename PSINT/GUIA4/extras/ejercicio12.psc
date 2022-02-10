//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos
//y ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna
//de ceros.
//Por ejemplo, nuestro matriz final debería verse así:
//	111111111111111
//	100000000000001
//	100000000000001
//	100000000000001
//	111111111111111 


Algoritmo ejercicio12
	Dimension mat(5,15)
	Definir mat,i,j Como Entero
	
	para i=0 Hasta 4 Hacer
		para j=0 Hasta 14 Hacer
			si i==0 o i==4 Entonces
				mat(i,j)=1
			sino 
				si j==0 o j==14
					mat(i,j)=1
				sino
					mat(i,j)=0
				FinSi
			FinSi
			
		FinPara
	FinPara
	mostrarMatriz(mat,5,15)
FinAlgoritmo

SubProceso mostrarMatriz(mat,n,m)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso