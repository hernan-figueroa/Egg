
//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.


Algoritmo ejercicio18
	
	Definir num,max,min,suma, contador Como Entero
	Definir estado Como Logico
	
	contador = 0
	suma=0
	estado=Falso

	Hacer		
		Escribir "Escribir un numero"
		Leer num 
		si num<>0
			si estado==Falso 
				max = num
				min = num
				estado=Verdadero
			FinSi		
			contador = contador +1
			si num>max
				max = num
			FinSi
			si num<min
				min = num
			FinSi
			suma = suma + num
			
		FinSi
	
	Mientras Que num <> 0
	
	si contador <>0
		Escribir "El maximo es: " max
		Escribir "El minimo es: " min
		Escribir "El promedio es: " suma/contador
	SiNo
		Escribir "Te parece ingresar un 0 de una?"
	FinSi
	
	
	
FinAlgoritmo
