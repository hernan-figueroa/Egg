//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
//	bisiesto. Nota: recuerde la funci�n mod de PSeInt

Algoritmo ejercicio09
	
	Definir anio Como Entero
	Definir bisiesto Como Logico
	
	Escribir "Ingrese un anio"
	Leer anio
	
	bisiesto=Falso
	
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
	
	si bisiesto==Verdadero
		Escribir "Es un anio bisiesto"
	SiNo
		Escribir "No es bisiesto"
	FinSi
	
	
	
FinAlgoritmo
