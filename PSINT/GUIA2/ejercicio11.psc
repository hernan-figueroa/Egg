//Construir un programa que simule un men� de opciones para realizar las cuatro
//	operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//	num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//	o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.

Algoritmo ejercicio11
	
	Definir num1, num2 Como Entero
	Definir letra Como Caracter
	
	Escribir "Ingrese dos numeros"
	Leer  num1 num2
	Escribir "Ingrese S para sumarlas, R para restarlas, M para multiplicarlas o D para dividirlas"
	Leer letra
	
	Segun letra
		"S":
			Escribir "La suma es igual a: " num1 + num2
		"R":
			Escribir "La resta es igual a: " num1 - num2
		"M":
			Escribir "La multiplicacion es igual a: " num1 * num2
		"D":
			Escribir "La division es igual a: " num1 / num2
	FinSegun
	
	
FinAlgoritmo
