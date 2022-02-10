//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
//número tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener
//		que separar el numero en partes (si es un numero de más de un digito) y ver si cada
//		numero es par o impar. Nota: recordar el uso de la función Mod y Trunc(). No podemos
//			pasar el numero a cadena para realizar el ejercicio.



Algoritmo ejercicio16
	
	Definir num Como Entero
	Escribir "Ingresar un numero"
	leer num
	Escribir sonImpares(num)
	
FinAlgoritmo

Funcion log<-sonImpares(num)
	Definir log Como Logico
	Definir aux Como Entero
	aux=0
	log=Verdadero
	Hacer
		si num%2<>0
			aux=trunc(num/10)
		sino
			log=falso
			aux=0
		FinSi
		num=aux
	Mientras Que aux<>0

FinFuncion
	