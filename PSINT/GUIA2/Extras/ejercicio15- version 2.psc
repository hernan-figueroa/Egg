//. Escriba un programa que solicite al usuario n�meros decimales mientras que el usuario
//escriba n�meros mayores al primero que se ingres�. Por ejemplo: si el usuario ingresa
//		como primer n�mero un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//		n�mero. El programa continuar� solicitando valores sucesivamente mientras los valores
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
