//Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
//	de los siguientes valores: 2+4+6+8+10. 

Algoritmo ejercicio21
	Definir num,suma,contador,pares Como Entero
	suma=0
	contador=0
	pares=0
	Escribir "Ingrese un numero"
	Leer num
	Hacer
		pares=pares+2
		suma= suma + pares
		contador = contador +1
		
	Mientras Que contador<>num
	
	Escribir "La suma es: ",suma
	
FinAlgoritmo
