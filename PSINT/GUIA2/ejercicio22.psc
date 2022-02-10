//22. Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree
//un cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
//		* * * *
//		* *
//		* *
//		* * * *
//	Nota: Recordar el uso del escribir sin saltar en Pseint.


Algoritmo ejercicio22
	
	Definir num, i,j,z Como Entero
	Definir supInf,derIzq Como Caracter
	supInf=""
	derIzq=""
	Escribir "Ingrese un numero"
	Leer num
	
	para i=1 Hasta num Hacer
		si i==1 o i==num
			para j=1 Hasta num Hacer
				supInf= supInf + "* "
			FinPara
			Escribir supInf
			supInf=""
		FinSi
		si i>1 y i<NUM
			para z=1 Hasta num Hacer
				si z==1 o z==num
					derIzq= derIzq + "* "
				SiNo
					derIzq= derIzq + "  "
				FinSi
			FinPara
			Escribir derIzq
			derIzq=""
		FinSi
	FinPara
	
	
FinAlgoritmo
