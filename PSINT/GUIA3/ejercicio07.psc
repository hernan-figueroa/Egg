//Crear una procedimiento que calcule la temperatura media de un d�a a partir de la
//temperatura m�xima y m�nima. Crear un programa principal, que utilizando un
//procedimiento, vaya pidiendo la temperatura m�xima y m�nima de n d�as y vaya
//mostrando la media de cada d�a. El programa pedir� el n�mero de d�as que se van a
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
	