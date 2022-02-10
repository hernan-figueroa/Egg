//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.


Algoritmo ejercicio07
	
	Definir num1,num2,num3 Como Entero
	
	Escribir "Ingrese un numero"
	Leer num1
	
	num1=trunc(num1/10)
	num2=trunc(num1/10)
	num3=trunc(num2/10)
	
	si num3==0 y num2<>0
		Escribir "El numero tiene 3 digitos"
	FinSi
	
	
FinAlgoritmo
