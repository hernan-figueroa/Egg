//Realizar un programa que calcule la siguiente sumatoria:
//	1 + 1/2! + 1/3! + ? + 1/n!
//	donde n es un valor entero ingresado por el usuario y n! es el factorial de ese número.

Algoritmo ejercicio28
	
	Definir num, factorial,i Como Entero
	Definir suma Como Real
	factorial = 1
	suma=0
	
	Escribir "Ingrese un numero"
	Leer num
	
	Para i=1 Hasta num Hacer
		factorial = factorial*i
		suma= suma + 1/factorial
		
	FinPara
	Escribir "El factorial de ",num," es ",suma
	
FinAlgoritmo
