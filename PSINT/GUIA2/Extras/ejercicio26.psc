//Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deber� mostrar:
//	*****
//	****
//	***
//	**
//	*

Algoritmo ejercicio26
	
	Definir asterisco Como Caracter
	Definir num,i,j Como Entero
	asterisco=""
	
	Escribir "Ingrese un numero"
	leer num
	
	para i=1 Hasta num Hacer
		para j=num-i Hasta 0 con paso -1
			asterisco=asterisco +"*"
		FinPara
		Escribir asterisco
		asterisco=""
	FinPara
	
FinAlgoritmo
