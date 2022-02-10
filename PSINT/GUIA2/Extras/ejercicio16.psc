//. Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas
//	vale el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres
//	notas obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los
//	datos del siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben
//	estar comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el
//		promedio y se mostrar� un mensaje de error.


Algoritmo ejercicio16
	
	Definir nombre Como Caracter
	Definir practica,problemas, teoria Como Real
	Escribir "Ingrese el nombre del alumno"
	Leer nombre
	
	Mientras nombre<>""
		Escribir "Ingrese la nota practica, la nota de problemas y la de teoria"
		Leer practica, problemas, teoria
		
		si practica>=0 y practica<=10 y problemas>=0 y problemas<=10 y teoria>=0 y teoria<=10 
			Escribir "La nota final del alumno ",nombre," fue de: ",practica*0.1+problemas*0.5+teoria*0.4
		SiNo
			Escribir "Error a cargar las notas"
		FinSi
		
		Escribir "Ingrese el nombre del alumno"
		Leer nombre
	FinMientras
	
FinAlgoritmo
