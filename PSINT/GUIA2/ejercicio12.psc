
//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni impar".
//Nota: investigar la funci�n mod de PSeInt 


Algoritmo ejercicio12
	
	Definir num, aux Como Entero
	
	Escribir "Escribir un numero"
	Leer num
	
	aux=num%2
	si num==0
		Escribir "El numero no es par ni impar"
	SiNo
		si aux==0
			Escribir "Es par"
		SiNo
			Escribir "Es impar"
		FinSi
	FinSi
	
	
	
FinAlgoritmo
