//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas)
//que tiene como propiedad especial que la suma de las filas, las columnas y las
//diagonales es igual. Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir
//	un algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso
//			de que sea mágica escribir la suma. Además, el programa deberá comprobar que los
//			números introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el
//			tamaño de la matriz que no debe superar orden igual a 10. 


Algoritmo ejercicio13
	
	Definir tam,i,num Como Entero
	
	Hacer
		Escribir "Ingrese el tamaño de la matriz de hasta 9"
		Leer tam
	Mientras Que tam>=9
	Dimension mat(tam,tam)
	Definir mat Como Entero
	llenarMat(mat,tam)
	Escribir "Es magico? ",esMagico(mat,tam,num)
	si esMagico(mat,tam,num)==Verdadero 
		Escribir "La suma es ", num
	FinSi
	
FinAlgoritmo

SubProceso llenarMat(mat,tam)
	Definir i,j Como Entero
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta tam-1 Hacer
			mat(i,j)=Aleatorio(1,9)
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara	
FinSubProceso


Funcion log<- esMagico(mat,tam,num Por Referencia)
	Definir log Como Logico
	Definir j,i,total1,total2 Como Entero
	log = Verdadero
	para i=0 Hasta tam-1 Hacer
		total1=0
		total2=0	
		Para j=0 Hasta tam-1 Hacer
			total1=total1+ mat(i,j)
		FinPara
		Para j=0 Hasta tam-1 Hacer
			total2=total2+ mat(j,i)
		FinPara
		si total1<>total2
			log=falso
		FinSi
	FinPara
	total2=0
	para i=0 Hasta tam-1 Hacer
		total2=total2+ mat(i,i)
	FinPara
	
	si total1<>total2
		log=falso
	FinSi
	total2=0
	para i=0 Hasta tam-1 Hacer
		total2=total2+ mat(tam-1-i,0+i)
	FinPara
	
	si total1<>total2
		log=falso
	FinSi
	
	si log==Verdadero
		num=total1
	FinSi
	
	
FinFuncion


