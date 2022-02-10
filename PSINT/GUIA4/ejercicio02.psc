//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo
//y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
//al arreglo.

Algoritmo ejercicio02
	Dimension vec(10)
	Definir vec,i,suma,resta,multiplicacion Como Real
	suma = 0
	resta = 0
	multiplicacion = 1
	para i=0 Hasta 9 Hacer
		Escribir "Escribir un numero"
		leer vec(i)
	FinPara
	
	para i=0 Hasta 9 Hacer
		suma= suma + vec(i)
		resta= vec(i) - resta
		multiplicacion= vec(i) * multiplicacion
	FinPara
	
	Escribir "La suma es de: " suma
	Escribir "La resta es de: " resta
	Escribir "La multiplicacion es de: " multiplicacion
	
FinAlgoritmo
