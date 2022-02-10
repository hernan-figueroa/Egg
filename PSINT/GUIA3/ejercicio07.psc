//Crear una procedimiento que calcule la temperatura media de un día a partir de la
//temperatura máxima y mínima. Crear un programa principal, que utilizando un
//procedimiento, vaya pidiendo la temperatura máxima y mínima de n días y vaya
//mostrando la media de cada día. El programa pedirá el número de días que se van a
//introducir.

Algoritmo ejercicio07
	
	Definir cantDias,i,dia Como Entero
	Definir tempMax,tempMin,media Como Real
	
	Escribir "Ingrese la cantidad de dias"
	Leer cantDias
	
	Para i=1 Hasta cantDias Hacer
		
		Escribir "Ingrese el numero de dia y la temperatura maxima y minima"
		Leer dia,tempMax,tempMin
		temperaturaMedia(tempMax,tempMin,media)
		Escribir "La temperatura media para el dia ",dia," fue de ",media
		
	FinPara
	
FinAlgoritmo

SubProceso temperaturaMedia(tempMax Por Valor,tempMin Por Valor,media Por Referencia)
	media = (tempMax + tempMin)/2
FinSubProceso
	