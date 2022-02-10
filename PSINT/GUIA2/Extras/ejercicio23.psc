//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de
//3 comprendidos entre 1 y 100. 

Algoritmo ejercicio23
	
	Definir contador1,contador2,i Como Entero
	contador1=0
	contador2=0
	Para i=1 Hasta 100 Hacer
		si i%2==0
			contador1=contador1 + 1
		FinSi
		si i%3==0
			contador2=contador2 + 1
		FinSi
	FinPara
	
	Escribir "La cantidad de numeros multiplos de 2 son: ",contador1
	Escribir "La cantidad de numeros multiplos de 3 son: ",contador2
	
FinAlgoritmo
