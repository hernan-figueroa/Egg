//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por
//el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra.
//En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.


Algoritmo ejercicio09
	Dimension mat(5,5)
	Definir mat,num,i,j Como Entero
	Definir bandera Como Logico
	bandera=falso
	para i=0 Hasta 4 Hacer
		para j=0 Hasta 4 Hacer
			mat(i,j)=Aleatorio(0,100)
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
	
	Escribir "Ingrese el numero buscado"
	Leer num
	para i=0 Hasta 4 Hacer
		para j=0 Hasta 4 Hacer
			si num==mat(i,j)
				Escribir "Las cordenadas son: [" i ";" j "]" 
				bandera=Verdadero
			FinSi
		FinPara
	FinPara
	
	si bandera==falso 
		Escribir "No se encontro"
	FinSi
	
FinAlgoritmo
