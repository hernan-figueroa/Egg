//22. Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
//un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
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
