//Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
//válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es
//		válida se debe imprimir la fecha cambiando el número que representa el mes por su
//	nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006". 

Algoritmo ejercicio06
	
	Definir dia,mes,anio Como Entero
	Definir estado, bisiesto Como Logico
	Definir elMes Como caracter
	
	Escribir "Escribir dia, mes y anio"
	Leer dia,mes,anio
	estado=Falso
	
	si anio%4==0
		si anio%100==0
			si anio%400==0
				bisiesto=Verdadero
			SiNo
				bisiesto=falso
			FinSi
		SiNo
			bisiesto=Verdadero
		FinSi
	SiNo
		bisiesto=falso
	FinSi
	
	si dia>=1 y dia<=31
		Segun mes Hacer
			1:	estado=Verdadero
				elMes="Enero"
			2: si dia<=28
					estado=Verdadero
					elMes="Febrero"
				SiNo
					si dia==29 y bisiesto==Verdadero
						estado=Verdadero
						elMes="Febrero"
					SiNo
						estado=falso
					FinSi
				FinSi
			3:	estado=Verdadero
				elMes="Marzo"
			4:	si dia<=30
					estado=Verdadero
					elMes="Abril"
				SiNo
					estado =Falso
				FinSi
			5:  estado=Verdadero
				elMes="Mayo"
			6:	si dia<=30
					estado=Verdadero
					elMes="Junio"
				SiNo
					estado =Falso
				FinSi
			7:  estado=Verdadero
				elMes="Julio"
			8:  estado=Verdadero
				elMes="Agosto"
			9:	si dia<=30
					estado=Verdadero
					elMes="Septiembre"
				SiNo
					estado =Falso
				FinSi
			10:	estado=Verdadero
				elMes="Octubre"
			11:	si dia<=30
					estado=Verdadero
					elMes="Noviembre"
				SiNo
					estado =Falso
				FinSi
			12: estado=Verdadero
				elMes="Diciembre"
				
		FinSegun
	FinSi
	
	si estado==Verdadero
		
		Escribir dia," de ",elMes," de ",anio
	SiNo
		Escribir "La fecha ingresada no es valida"
	FinSi


	
FinAlgoritmo
