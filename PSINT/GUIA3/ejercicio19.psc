//El número de combinaciones de m elementos tomados de n es:
//	(
//	!
//	" ) = ( !!
//	"!(!%")!
//	)
//	Diseñar una función que permita calcular el número combinatorio de (
//	m
//	n )
//Nota: n debe ser mayor a 0 y menor que m.



Algoritmo ejercicio19
	Definir m,n Como Entero
	Hacer
		Escribir "Escribir dos numeros"
		Leer m, n
	Mientras Que n<0 o n>m
	
	Escribir combinatorio(m,n)
	
	
FinAlgoritmo


funcion ent<- combinatorio(m,n)
	Definir ent,i,factorialM,factorialN,factorialMN Como Entero
	factorialM=1
	factorialN=1
	factorialMN=1
	para i=1 Hasta m Hacer
		factorialM=factorialM*i
	FinPara
	para i=1 Hasta n Hacer
		factorialN=factorialN*i
	FinPara
	para i=1 Hasta m-n Hacer
		factorialMN=factorialMN*i
	FinPara
	
	ent= factorialM/(factorialN*factorialMN)
FinFuncion
	