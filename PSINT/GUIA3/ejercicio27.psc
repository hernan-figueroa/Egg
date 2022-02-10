//Realice nuevamente un programa que calcule la función de Fibonacci pero esta vez de
//manera recursiva.


Algoritmo ejercicio27
	
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	Escribir fibo(num)
	
FinAlgoritmo

funcion ent<- fibo(num)
	Definir ent Como Entero
	ent=0
	si num<=1
		ent=num
	SiNo
		ent= fibo(num-1) + fibo(num-2)
	FinSi
	
FinFuncion
	