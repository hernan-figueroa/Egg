//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
//solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el
//l�mite inicial.

Algoritmo ejercicio15
	
	Definir limite, num, suma Como Entero
	
	suma = 0
	
	Escribir "Ingrese un valor limite"
	Leer limite
	
	Mientras suma<=limite
		
		Escribir "Ingrese un numero"
		Leer num
		suma = suma + num
		
	FinMientras
	
	Escribir "La suma supero al limite establecido"
	
FinAlgoritmo
