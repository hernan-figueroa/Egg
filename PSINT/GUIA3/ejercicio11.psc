//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo ejercicio11
	
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	Escribir "La de los divisores es igual a ",sumaDivisores(num)
	
FinAlgoritmo

Funcion total<-sumaDivisores(num)
	
	Definir total,i Como Entero
	total=0
	para i=1 Hasta num-1 Hacer
		si num%i==0 Entonces
			total = total + i
		FinSi
	FinPara
	
FinFuncion
	