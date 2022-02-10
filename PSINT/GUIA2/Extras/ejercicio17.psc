//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la función trunc().


Algoritmo ejercicio17
	
	Definir num,contador Como Entero
	contador=0
	Escribir "Ingrese un numero"
	Leer num
	
	Mientras num>0
		contador=contador+1
		num=trunc(num/10)
	FinMientras
	
	Escribir "La cantidad de digitos que tiene es: ", contador
	
FinAlgoritmo
