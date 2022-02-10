//Realizar un programa que pida un numero y determine si ese numero es par o impar.
//	Mostrar en pantalla un mensaje que indique si el numero es par o impar. (para que un
//		número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
//			la función mod de Pseint. 

Algoritmo ejercicio05
	
	Definir num, aux Como Entero
	
	Escribir "Escribir un numero"
	Leer num
	
	aux=num%2
	
	si aux==0
		Escribir "Es par"
	SiNo
		Escribir "Es impar"
	FinSi
	
FinAlgoritmo
