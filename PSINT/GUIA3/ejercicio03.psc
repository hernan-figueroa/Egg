//Crea una función EsMultiplo que reciba los dos números pasados por el usuario,
//validando que el primer numero múltiplo del segundo y devuelva verdadero si el primer
//	numero es múltiplo del segundo, sino es múltiplo que devuelva falso.

Algoritmo ejercicio03
	
	Definir num1,num2 Como Entero
	Escribir "Ingrese dos numeros"
	Leer num1,num2
	
	si esMultiplo(num1,num2)==Verdadero
		Escribir num1," es multiplo de ",num2
	SiNo
		Escribir num1," no es multiplo de ",num2
	FinSi
	
	
FinAlgoritmo


Funcion log<- esMultiplo(num1,num2)
	Definir log Como Logico
	si num1%num2==0
		log=Verdadero
	SiNo
		log=Falso
	FinSi
FinFuncion
	