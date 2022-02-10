//. Escriba un programa que solicite al usuario números decimales mientras que el usuario
//escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa
//		como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//		número. El programa continuará solicitando valores sucesivamente mientras los valores
//			ingresados sean mayores que 3.1, caso contrario, el programa finaliza.


Algoritmo ejercicio15
	Definir num,num2,aux Como Real
	Definir aux2 Como Entero
	Definir log Como Logico
	
	Escribir "Ingrese un numero"
	Leer num
	log = falso
	
	Mientras log==falso
		Escribir "Ingrese un numero"
		Leer num2
		aux2=trunc(num2)
		aux= num2 - aux2
		si aux <>0 Entonces
			log=Verdadero
		FinSi
	FinMientras

	
FinAlgoritmo
