//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las
//dos primeras columnas contendrán valores enteros ingresados por el usuario y en la 3
//columna se deberá almacenar el resultado de sumar el número de la primera y segunda
//columna. Mostrar la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5 


Algoritmo ejercicio14
	Definir tam Como Entero
	Escribir "Ingrese la cantidad de filas que desea"
	Leer tam
	Dimension mat(tam,3)
	Definir mat Como Entero
	llenaDosCulumnas(mat,tam)
	mostrarMatriz(mat,tam)
FinAlgoritmo

SubProceso llenaDosCulumnas(mat,tam)
	Definir i,j Como Entero
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta 2 Hacer
			si j<2 Entonces
				Escribir "Ingrese un numero"
				Leer mat(i,j)
			SiNo
				mat(i,j)= mat(i,j-2)+mat(i,j-1)
			FinSi
			
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(mat,tam)
	Definir i,j Como Entero
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta 2 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso	