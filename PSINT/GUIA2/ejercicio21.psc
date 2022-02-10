//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de
//sus N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
//de sus estudiantes:
//	? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//		? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//		14
//		? La mayor nota obtenida en las exposiciones.
//		? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//		El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno
//		pedirá las 3 notas y calculará todos informes claves que requiere el docente.
//	Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
//			ejercicio. No hacer todos al mismo tiempo y después probar.


Algoritmo ejercicio21
	
	Definir notaTP, notaExposicion, notaParcial, suma,total,mayorNota Como Real
	Definir cantAlumnos, i ,j, contador,contadorTotal,cuentaNotaTp, cuentaNotaParcial Como Entero
	suma=0
	contador=0
	cuentaNotaTp=0
	cuentaNotaParcial=0
	mayorNota=0
	Escribir "Ingrese la cantidad de alumnos"
	Leer cantAlumnos
	
	Para i=1 Hasta cantAlumnos Hacer
		
		Escribir "Ingrese las notas de trabajo practico integrador, de la exposicion y del parcial en ese orden."
		Leer notaTP notaExposicion notaParcial
		total= notaTP*0.35 + notaExposicion*0.25 + notaParcial*0.4
		Escribir total
		si total<6.5
			suma=suma+total
			contador= contador +1
		FinSi
		si notaTP>7.50
			cuentaNotaTp = cuentaNotaTp +1
		FinSi
		si notaExposicion>mayorNota
			mayorNota = notaExposicion
		FinSi
		si notaParcial>=4 y notaParcial<=7.5
			cuentaNotaParcial = cuentaNotaParcial +1
		FinSi
	FinPara
	
	si contador<>0
		Escribir "El promedio final de los estudiantes que reprobaron el curso fue de: " suma/contador
	FinSi
	Escribir "El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 fue de: " cuentaNotaTp/cantAlumnos*100 "%."
	Escribir "La mayor nota obtenida en las exposiciones fue de: " mayorNota
	Escribir "Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 fue de: " cuentaNotaParcial
	
	
FinAlgoritmo
