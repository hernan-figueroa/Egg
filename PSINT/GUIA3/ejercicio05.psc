//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
//	numero es primo o no. Un número es primo cuando es divisible sólo por 1 y por sí
//mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo ejercicio05
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	si esPrimo(num)==Verdadero
		Escribir "El numero ",num," es primo."
	sino
		Escribir "El numero ",num," no es primo."
	FinSi
	
FinAlgoritmo

Funcion log<- esPrimo(num)
	Definir log Como Logico
	Definir i,contador Como Entero
	contador=0
	
	Para i=1 Hasta num Hacer
		si num%i==0
			contador=contador+1
		FinSi
	FinPara
	
	si contador==2
		log=Verdadero
	SiNo
		log=Falso
	FinSi
	
FinFuncion
	