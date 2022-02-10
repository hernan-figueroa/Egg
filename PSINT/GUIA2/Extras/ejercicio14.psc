//Escriba un programa que solicite dos números enteros (mínimo y máximo). A
//continuación, se debe pedir al usuario que ingrese números enteros situados entre el
//máximo y mínimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminará cuando se escriba un número que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//números ingresados dentro del intervalo.


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
