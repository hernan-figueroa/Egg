//Los empleados de una f�brica trabajan en dos turnos: Diurno y Nocturno. Se desea
//calcular el jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y
//		en un 15% si el turno es nocturno.
//		El programa debe solicitar la siguiente informaci�n al usuario: el nombre del trabajador,
//			el d�a de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas.
//			Adem�s, debemos preguntarle al usuario si el d�a de la semana (lunes, martes,
//				mi�rcoles, etc.) era festivo o no, para poder calcular el jornal diario. Utilice una funci�n
//					para realizar el c�lculo.


Algoritmo ejercicio14
	
	Definir nombre,dia,turno,festivo Como Caracter
	Definir horas Como Entero
	Escribir "Ingrese nombre, dia, turno(diurno o nocturno), horas trabajadas y si el dia era festivo (si o no)"
	Leer nombre,dia,turno,horas,festivo
	
	Escribir "El jornal de ",nombre," del dia", dia," es de: ",jornal(turno,horas,festivo)
	
FinAlgoritmo

Funcion ent<- jornal(turno,horas,festivo)
	Definir ent Como real
	
	si turno=="diurno"
		ent=horas*90
		si festivo=="si"
			ent=ent*1.1
		FinSi
	SiNo
		ent=horas*125
		si festivo=="si"
			ent=ent*1.15
		FinSi
	FinSi


	
FinFuncion
	