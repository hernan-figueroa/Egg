//Disponemos de un vector unidimensional de 20 elementos de tipo car�cter. Se pide
//desarrollar un programa que:
//	a. Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por
//letra. Ayuda: utilizar la funci�n Subcadena de PSeInt.
//	b. Una vez completado lo anterior, pedirle al usuario un car�cter cualquiera y una
//	posici�n dentro del arreglo, y el programa debe intentar ingresar el car�cter
//	en la posici�n indicada, si es que hay lugar (es decir la posici�n est� vac�a o
//	es un espacio en blanco). De ser posible debe mostrar el vector con la frase y
//	el car�cter ingresado, de lo contrario debe darle un mensaje al usuario de que
//	esa posici�n estaba ocupada.
//Por ejemplo, suponiendo la siguiente frase y los sub�ndices del vector:
//	H o l a m u n d o c r u e l !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//Si se desea ingresar el car�cter "%" en la posici�n 10, entonces el resultado ser�a:
//		H o l a m u n d o % c r u e l !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19



Algoritmo ejercicio06
	
	Dimension vec(20)
	Definir vec,frase,letra Como Caracter
	Definir i,pos Como Entero
	Escribir "Ingrese frase menos de 20 letras"
	Leer frase
	
	para i=0 Hasta 19 Hacer
		si i<Longitud(frase) Entonces // hola = 4 // i<4
			vec(i)=Subcadena(frase,i,i) // hola
		SiNo
			vec(i)=" " //               
		FinSi
	FinPara
	
	Escribir "Ingrese una letra y una posicion"
	Leer letra,pos
	
	si vec(pos-1)==" "
		vec(pos-1)=letra
		para i=0 Hasta 19 Hacer
			Escribir vec(i) Sin Saltar
		FinPara
		Escribir " "
	SiNo
		Escribir "La posicion se encuentra ocupada"	
	FinSi
	
FinAlgoritmo
