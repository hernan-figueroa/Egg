//Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2.
//Chequear que si N es impar se muestre un mensaje de error.


Algoritmo ejercicio25
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	Escribir sumaPares(num)
	
FinAlgoritmo

Funcion ent<- sumaPares(num)
	Definir ent Como Entero
	ent=num
	si num<>0 y num%2==0
		ent=ent + sumaPares(num-2)
	FinSi
	
FinFuncion
	