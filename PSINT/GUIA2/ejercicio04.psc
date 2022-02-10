//Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. Si el usuario
//	ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO"


Algoritmo ejercicio04
	
	Definir letra Como Caracter
	
	Escribir "Escribir S o N"
	Leer  letra
	
	Si letra=="S" O letra=="N"
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
