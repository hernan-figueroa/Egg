//Construir un programa que simule un menú de opciones para realizar las cuatro
//	operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//	numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//	o ?m? para la multiplicación y ?D? o ?d? para la división.

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
