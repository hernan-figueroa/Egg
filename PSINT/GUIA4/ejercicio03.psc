//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a
//buscar tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n
//donde se encuentra el valor. En caso que el n�mero se encuentre repetido dentro del
//arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar
//un mensaje.

Algoritmo ejercicio03
	Definir n Como Entero
	Escribir "Ingrese la cantidad de numeros"
	Leer n
	
	dimension vec(n)
	Definir vec,i, num Como Entero
	Definir seEncuentra Como Logico
	seEncuentra=Falso
	
	para i=0 Hasta n-1 Hacer
		Escribir "Ingrese un numero"
		Leer vec(i)
	FinPara
	
	Escribir "Ingrese el numero a buscar"
	Leer num
	
	para i=0 Hasta n-1 Hacer
		si vec(i)==num
			Escribir "El numero buscado se encuentra en la posicion: " i
			seEncuentra=Verdadero
		FinSi
	FinPara
	
	si seEncuentra==Falso
		Escribir "El numero no se encuentra en el vector"
	FinSi
	
FinAlgoritmo
