//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
//continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
//m�ximo y m�nimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminar� cuando se escriba un n�mero que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//n�meros ingresados dentro del intervalo.


Algoritmo ejercicio14
	Definir min,max,num,contador Como Entero
	
	Escribir "Ingrese un numero minimo y maximo"
	Leer min max
	Escribir "Ingrese un numero"
	leer num
	contador=1
	Mientras num>min y num<max
		Escribir "Ingrese un numero"
		leer num
		contador=contador +1
	FinMientras
	
	Escribir "La cantidad de numero ingresados fue de: ", contador
FinAlgoritmo
