//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
//numero es capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc.
//		No podemos transformar el numero a cadena para realizar el ejercicio.


Algoritmo ejercicio18
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	Escribir "Es capicua?  " esCapicua(num)
	
FinAlgoritmo

Funcion log<- esCapicua(num)
	Definir log Como logico
	Definir aux,aux1,numCifras,numSuma,numComparacion,cifras,a,b,i,sumatoria Como Entero
	cifras =0
	sumatoria=0
	aux1=1
	numCifras=num
	numSuma=num
	numComparacion=num
	Hacer
		aux=trunc(numCifras/10)
		numCifras=aux
		cifras=cifras+1
	Mientras Que aux<>0
	
	para i=1 Hasta cifras-1
		aux1=aux1*10
	FinPara
	
	para i=1 Hasta cifras
		a=numSuma%10 // 121 = 1 // 12 = 2
		b=a*aux1 //b=1*100 // 2 *10 = 20
		numSuma=trunc(numSuma/10) // 12
		aux1=trunc(aux1/10) // 10
		sumatoria= sumatoria+b // 100+ 20
	FinPara
	
	si numComparacion==sumatoria Entonces
		log=Verdadero
	sino 
		log=Falso
	FinSi
	
	
FinFuncion
	