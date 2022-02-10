//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha
//	anterior. Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba
//		una fecha representada a través de tres enteros dia, mes y anio, y retorne la fecha
//		anterior. Puede asumir que dia, mes y anio representan una fecha válida. Realice
//		pruebas de escritorio para los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3,
//				anio=2004.


Algoritmo ejercicio23
	
	Definir dia,mes, anio Como Entero
	Escribir "Ingrese dia, mes y anio"
	Leer dia,mes,anio
	
	diaAnterior(dia,mes,anio)
FinAlgoritmo

SubProceso diaAnterior(dia,mes,anio)
	Definir diaMax Como Entero
	
	si dia>1 Entonces
		Escribir dia-1,"/",mes,"/",anio
	SiNo
		si dia==1 y mes>1
			Segun mes-1 
				caso 1: diaMax=31
				caso 2: diaMax=29
				caso 3: diaMax=31
				caso 4: diaMax=30
				caso 5: diaMax=31
				caso 6: diaMax=30
				caso 7: diaMax=31
				caso 8: diaMax=31
				caso 9: diaMax=30
				caso 10: diaMax=31
				caso 11: diaMax=30
				caso 12: diaMax=31	
			FinSegun
			Escribir diaMax,"/",mes-1,"/",anio
		SiNo
			Escribir 31,"/",12,"/",anio-1
		FinSi
	FinSi
	
FinSubProceso
	