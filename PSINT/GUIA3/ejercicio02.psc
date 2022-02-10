//Realizar una función que valide si un numero es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe
//		tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo ejercicio02
	
	Definir num como entero
	Escribir "Ingrese un numero"
	Leer num
	
	si esPar(num)==Verdadero 
		Escribir "El numero ",num," es par."
	SiNo
		Escribir "El numero ",num," es impar."
	FinSi
	
	
FinAlgoritmo

Funcion log <- esPar(num)
	Definir log Como Logico
	si num%2==0
		log=Verdadero
	SiNo
		log=Falso
	FinSi
FinFuncion
	