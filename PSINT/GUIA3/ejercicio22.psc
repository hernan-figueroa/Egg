//Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el número 3:
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
	