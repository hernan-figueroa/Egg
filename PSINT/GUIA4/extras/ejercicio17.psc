//Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco
//zonas: Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene
//	distintas estadísticas sobre el comportamiento de sus representantes en cada zona. Se
//	desea hacer un programa que lea el monto de las ventas de los representantes en cada
//zona y calcule luego:
//	a) el total de ventas de una zona introducida por teclado
//	b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//	c) el total de ventas de todos los representantes.


Algoritmo ejercicio17
	
	Definir representante,zona Como Entero
	Definir opc Como Caracter
	Definir monto Como Real
	Dimension mat(4,4)
	Definir mat Como real
	llenarMatriz(mat)
	Hacer
		Escribir "Ingrese un representante (1 al 4) . Ingrese 0 para menu informe"
		Leer representante
		si representante<>0
			Escribir "Ingrese una zona(1=norte,2=sur,3=este y 4=oeste) y monto"
			Leer zona,monto
			mat(representante-1,zona-1)=mat(representante-1,zona-1) + monto
		FinSi
		
	Mientras Que representante<>0
	Hacer
		Escribir "Elija la opcion deseada:"
		Escribir "a) el total de ventas de una zona introducida por teclado"
		Escribir "b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas"
		Escribir "c) el total de ventas de todos los representantes."
		Escribir "presione cualquier otra tecla para salir."
		Leer opc
		
		Segun opc
			"a":
				Escribir "Ingrese una zona(1=norte,2=sur,3=este y 4=oeste)"
				Leer zona
				Escribir "El total vendido: " ventasPorZona(mat,zona)
				Escribir "---------------------------------------------"
			"b":
				Escribir "Ingrese un representante (1 al 4)"
				Leer representante
				ventasPorRepresentante(mat,representante)
				Escribir "---------------------------------------------"
			"c":
				Escribir "El total vendido fue: " totalVentas(mat)
				Escribir "---------------------------------------------"
			De Otro Modo: opc="0"
		FinSegun
		
	Mientras Que opc<>"0"
	
	
	
FinAlgoritmo

SubProceso llenarMatriz(mat)
	Definir i,j Como Entero
	para i=0 Hasta 3 Hacer
		para j=0 Hasta 3 Hacer
			mat(i,j)=0
		FinPara
	FinPara
FinSubProceso

Funcion total<- ventasPorZona(mat,zona)
	Definir total Como Real
	Definir i Como Entero
	total=0
		para i=0 Hasta 3 Hacer
			total=total+mat(i,zona-1)
		FinPara

FinFuncion

SubProceso ventasPorRepresentante(mat,representante)
	Escribir "Norte: " mat(representante-1,0) " | Sur: " mat(representante-1,1) " | Este: " mat(representante-1,2) " | Oeste: " mat(representante-1,3)
	
FinSubProceso

Funcion total<- totalVentas(mat)
	Definir total Como Real
	Definir i,j Como Entero
	total=0
	para i=0 Hasta 3 Hacer
		para j=0 Hasta 3 Hacer
			total= total + mat(i,j)
		FinPara
	FinPara
	
FinFuncion

