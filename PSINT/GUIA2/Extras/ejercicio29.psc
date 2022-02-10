//Escribir un programa que calcule los primeros 4 centros numéricos. Un centro numérico
//es un número que separa una lista de números enteros (comenzando en 1) en dos
//grupos de números, cuyas sumas son iguales. El primer centro numérico es el 6, el cual
//separa la lista (1 a 8) en los grupos: (1, 2, 3, 4, 5) y (7, 8) cuyas sumas son ambas iguales
//a 15. El segundo centro numérico es el 35, el cual separa la lista (1 a 49) en los grupos:
//	(1 a 34) y (36 a 49) cuyas sumas son ambas iguales a 595.
//Nota: investigar que es un centro numérico en caso de no saber que es. 

Algoritmo ejercicio29
	
	Definir n,sumAC,sumDC,num,i,j,contador Como Entero
	n=5000
	num=1
	sumAC=0
	sumDC=1
	contador =0

	Hacer
		Para i=1 Hasta num con paso 1  Hacer
			sumAC=sumAC+i
		FinPara
		Para j=num+2 Hasta num*2 con paso 1 Hacer
			si sumAC==sumDC Entonces
				Escribir num+1 " Es centro numerico"
				Escribir sumAC
				Escribir sumDC
				contador = contador +1
				j=num*2
			SiNo
				sumDc=sumDC+j
			FinSi
		FinPara
		num = num +1
		sumAC=0
		sumDC=0
		
	Mientras Que contador<4

	Escribir "fin"
	
FinAlgoritmo
