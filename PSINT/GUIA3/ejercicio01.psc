//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
//	pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
//		calcular� la suma y lo devolver� para imprimirlo en el algoritmo.



Algoritmo ejercicio01
	
	Definir num1,num2 Como Entero
	
	Escribir "Ingrese dos numeros enteros"
	Leer num1,num2
	
	Escribir "La suma de ",num1," + ",num2," es ", sumaDosNumeros(num1,num2) // 1,2
	
FinAlgoritmo

Funcion total <- sumaDosNumeros(num1,num2)
	
	Definir total Como Entero
	total= num1+num2 // 1 +2 = 3

FinFuncion
	