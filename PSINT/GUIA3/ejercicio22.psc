//Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
//comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el n�mero 3:
//1
//12
//123


Algoritmo ejercicio22
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	escalera(num)
	
FinAlgoritmo

SubProceso escalera(num)
	Definir i,j Como Entero
	Definir dibujo Como Caracter
	
	
	para i=1 Hasta num Hacer
		dibujo=""
		para j=1 Hasta i
			dibujo= dibujo + ConvertirATexto(j)
		FinPara
		Escribir dibujo
	FinPara
	
	
	
FinSubProceso
	