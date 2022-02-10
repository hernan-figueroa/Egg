//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de
//las cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos
//prácticos de un estudiante.

Algoritmo ejercicio11
	Definir notaMenor, notas, suma Como Real
	Definir primeraNota Como Logico
	Definir i Como Entero
	notaMenor=0
	suma=0
	primeraNota=falso
	
	Para i=1 Hasta 4 Hacer
		Escribir "Ingrese la nota ",i," de los trabajos practicos"
		Leer notas
		suma = suma + notas
		si primeraNota==Falso
			notaMenor=notas
			primeraNota=Verdadero
		SiNo
			si notas<notaMenor
				notaMenor=notas
			FinSi
		FinSi
		
		
	FinPara
	Escribir "La nota eliminada fue: ", notaMenor
	Escribir "El promedio fue de: ",(suma-notaMenor)/3
	
FinAlgoritmo
