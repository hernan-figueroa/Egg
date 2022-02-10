//"Batalla naval espacial": Este juego se juega en un tablero de 4 x 4, donde las filas se
//	identifican de la A hasta la D y las columnas del 1 al 4. En el juego participan 2
//contendientes: el defensor y el atacante. Dicho juego consiste en:
//	El defensor, ubica solo una nave nodriza triple con ciertas reglas:
//		2.1) La nave debe ubicarse de tal forma que sus partes queden contiguas, ya
//		sea horizontal o vertical, pero no es válido en forma oblicua.
//		2.2) Cada una de las tres partes que compone la nave contiene un escudo
//		de electrones medido con un valor del 1 al 9, el cual debe pedirse al
//		usuario junto con su posición.
//	A continuación, se ilustra un ejemplo de una ubicación posible:
//		1 2 3 4
//		A
//		B
//		C 4 7 1
//		D
//		2.3) El atacante, indicando una coordenada del tablero (por ejemplo, C3) y
//		una carga de protones, debe intentar acertar a la nave de su contrincante.
//	El ataque, posee las siguientes reglas:
//		a) La carga de protones asociada al ataque corresponde a un valor del 1 al 9.
//		b) ¡Si el atacante no acierta en la posición, entonces el defensor informa
//			"Espacio!".
//		c) Si el atacante acierta la posición:
//c.1) El ataque es "efectivo" y resta el valor de la carga protones al escudo de
//electrones, si y solo sí, el valor de la carga de protones es menor o igual al
//	valor restante de electrones del escudo. En el ejemplo de ubicación anterior
//	si el atacante indica C3 con carga 9, el ataque es "sin efecto" y no genera
//		daño alguno. Pero si indica C3 con carga 4 el ataque es "efectivo" y el escudo
//			de la posición queda con carga de 3 electrones.
//			c.2) Luego del ataque se debe indicar si fue efectivo o no, si se neutralizó o
//					no el escudo del casillero y la suma total de electrones que resta para hundir
//						la nave. El escudo de un casillero se neutraliza cuando llega a cero.
//						Suponiendo que en el primer ataque se indica C3 con carga 4, se indica
//						"Ataque efectivo ? Escudo no neutralizado ? Carga restante de electrones
//						igual a 3".
//						d) Cada vez que el atacante realiza un disparo resta el valor de la carga de su
//						reactor de protones. El reactor de la nave atacante es de 40 protones. Un
//						disparo a realizar no puede superar la carga de protones restantes.
//					El juego termina cuando se cumple alguna de las siguientes situaciones:
//						a) Gana el atacante cuando deja sin escudos a la nave nodriza y todavía le
//						queda carga para un disparo más.
//							b) Gana el defensor cuando el atacante se queda sin carga en el reactor de
//							protones.
//							Realice un programa que implemente la lógica del juego, iniciando con la distribución de la
//							nave en el tablero por parte del defensor, y luego desarrollando la partida del atacante hasta
//							la culminación del juego. El programa debe indicar quién ganó el juego


Algoritmo ejercicio02
	Dimension mat(4,4)
	Definir mat Como entero
	llenarMatriz(mat)
	Escribir "***********" "DEFENSA" "***********"
	defensa(mat)
	mostrarMatriz(mat)
	Escribir "***********" "ATAQUE" "***********"
	
FinAlgoritmo
SubProceso llenarMatriz(mat)
	Definir i,j Como Entero
	para i=0 Hasta 3 Hacer
		para j=0 Hasta 3 Hacer
			mat(i,j)=0
		FinPara
	FinPara
FinSubProceso

Funcion estado<- estadoEscudos(mat)
	Definir i,j Como Entero
	estado=falso
	para i=0 Hasta 3 Hacer
		para j=0 Hasta 3 Hacer
			si mat(i,j)<>0 Entonces
				estado=Verdadero
			FinSi
		FinPara
	FinPara
FinFuncion


SubProceso ataque(mat)
	Definir i, j,proton,reactor Como Entero
	Definir pos Como Caracter
	definir salir Como Logico
	salir=Falso
	reactor=40
	Hacer
		Escribir "Ingrese ubicacion del ataque"
		Leer pos
		Hacer
			Escribir "Carga de protones"
			Leer proton
		Mientras Que (proton>9) O (proton<1)
		si mat(letraANumero(Subcadena(pos,0,0)),ConvertirANumero(Subcadena(pos,1,1)))==0 Entonces
			Escribir "Espacio!"
		SiNo
			si mat(letraANumero(Subcadena(pos,0,0)),ConvertirANumero(Subcadena(pos,1,1)))<=proton Entonces
				Escribir "Ataque efectivo!"
				mat(letraANumero(Subcadena(pos,0,0)),ConvertirANumero(Subcadena(pos,1,1)))=mat(letraANumero(Subcadena(pos,0,0)),ConvertirANumero(Subcadena(pos,1,1)))-proton
					
				si mat(letraANumero(Subcadena(pos,0,0)),ConvertirANumero(Subcadena(pos,1,1)))<=0 Entonces
					Escribir "Escudo neutralizado!"
					mat(letraANumero(Subcadena(pos,0,0)),ConvertirANumero(Subcadena(pos,1,1)))=0
				SiNo
					Escribir "Escudo no neutralizado. Carga restante de electrones: " mat(letraANumero(Subcadena(pos,0,0)),ConvertirANumero(Subcadena(pos,1,1)))
				FinSi
				
			FinSi
		FinSi
		reactor=reactor-1
		
		si estadoEscudos(mat)==falso y reactor>0 
			salir=Verdadero
			
		FinSi
		
	Mientras Que reactor<>0 y salir==Falso
	si reactor==0 Entonces
		Escribir "El defensor a ganado"
	FinSi
FinSubProceso


SubProceso defensa(mat)
	Definir i, j,escudo Como Entero
	Definir pos Como Caracter
	Definir consecutivos Como Logico
	consecutivos=falso
	Hacer
		para i=0 Hasta 2 Hacer
			Escribir "Ingrese ubicacion de la parte ",i+1
			Leer pos
			Hacer
				Escribir "Puntos de escudo"
				Leer escudo
			Mientras Que (escudo>9) O (escudo<1)
			mat(letraANumero(Subcadena(pos,0,0)),ConvertirANumero(Subcadena(pos,1,1)))=escudo
			//mostrarMatriz(mat)
			si i==2 y (buscarConsecutivosFila(mat)==Verdadero o buscarConsecutivosColumna(mat)==Verdadero)
				consecutivos=Verdadero
			FinSi
		FinPara
	Mientras Que consecutivos==falso

FinSubProceso



funcion num<-letraANumero(letra)
	Definir num Como Entero
	Segun letra Hacer
		"A": num=0
		"B": num=1
		"C": num=2
		"D": num=3
	FinSegun
FinFuncion

Funcion ok<-buscarConsecutivosFila(mat)
	definir ok Como Logico
	Definir i,j,contador Como Entero
	ok=Falso
	contador=0
	para i=0 Hasta 3 Hacer
		para j=0 Hasta 3 Hacer
			si mat(i,j)<>0 Entonces
				contador=contador+1
				si contador==3 Entonces
					ok=Verdadero
				FinSi
			SiNo
				contador=0
			FinSi
		FinPara
		
	FinPara
finFuncion

Funcion ok<-buscarConsecutivosColumna(mat)
	definir ok Como Logico
	Definir i,j,contador Como Entero
	ok=Falso
	contador=0
	para j=0 Hasta 3 Hacer
		para i=0 Hasta 3 Hacer
			si mat(i,j)<>0 Entonces
				contador=contador+1
				si contador==3 Entonces
					ok=Verdadero
				FinSi
			SiNo
				contador=0
			FinSi
		FinPara
	FinPara
finFuncion

SubProceso mostrarMatriz(mat)
	Definir i,j Como Entero
	para i=0 Hasta 3 Hacer
		para j=0 Hasta 3 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso	
	