//Escribir un programa que calcule la suma de los N primeros números naturales. El valor
//de N se leerá por teclado

Algoritmo ejercicio24
	
	Definir num,suma,contador,natural Como Entero
	suma=0
	contador=0
	natural=0
	Escribir "Ingrese un numero"
	Leer num
	Hacer
		natural=natural+1
		suma= suma + natural
		contador = contador +1
		
	Mientras Que contador<>num
	
	Escribir "La suma es: ",suma
	
FinAlgoritmo
