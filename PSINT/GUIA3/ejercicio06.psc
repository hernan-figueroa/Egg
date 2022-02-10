//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo
//entero. La variable A, debe terminar con el valor de la variable B.

Algoritmo ejercicio06
	
	Definir variableA,variableB Como Entero
	
	Escribir "Ingrese la variable A y luego la variable B"
	Leer variableA,variableB
	intercambiador(variableA,variableB)
	Escribir "La variable A ahora vale ",variableA," y la variable B ahora vale ",variableB
	
FinAlgoritmo

SubProceso intercambiador(variableA Por Referencia,variableB Por Referencia)
	
	Definir aux Como Entero
	
	aux=variableA
	variableA=variableB
	variableB=aux
	
FinSubProceso
	