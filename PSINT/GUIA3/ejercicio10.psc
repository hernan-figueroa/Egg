//Escribir una función recursiva que devuelva la suma de los primeros N enteros.


Algoritmo ejercicio10
	Definir n Como Entero
	Escribir "Ingrese un numero"
	Leer n
	Escribir sumaEnteros(n)
	
FinAlgoritmo

Funcion num<- sumaEnteros(n)
	
	Definir num Como Entero
	num=n
	
	si n<>0 Entonces
		num=num +sumaEnteros(n-1)
	FinSi
	
FinFuncion
	