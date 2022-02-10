//Una empresa tiene personal de distintas áreas con distintas condiciones de
//contratación y formas de pago. El departamento de contabilidad necesita calcular los
//sueldos semanales (lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo. 
//
//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//	realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//	empleado.
//	b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//		hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//		esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//		como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//		del valor de venta total.
//	c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//		hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//		horas semanales, las horas extras se deben pagar con un extra del 50% del valor de
//		la hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene
//		un empleado. 

Algoritmo ejercicio12
	
	Definir modalidad Como Caracter
	Definir ventas,valorHora,cantHoras Como Real
	Escribir "Elija la modalidad:"
	Escribir "a) comision."
	Escribir "b) salario fijo + comision."
	Escribir "c) salario fijo."
	Leer modalidad
	
	Segun modalidad Hacer
		"a": 
			Escribir "Ingresar el monto total de las ventas realizadas en la semana"
			Leer ventas
			Escribir "El salario es de: ", ventas*0.4
		"b":
			Escribir "Ingresar valor hora, la cantidad de horas trabajadas y monto total de ventas"
			Leer valorHora, cantHoras, ventas
			
			si cantHoras<=40
				Escribir "El salario es de: ",valorHora*cantHoras +(ventas*0.25)
			SiNo
				Escribir "El salario es de: ",valorHora*40 +(ventas*0.25)
			FinSi
		"c":
			Escribir "Ingresar valor hora y la cantidad de horas trabajadas."
			Leer valorHora, cantHoras
			
			si cantHoras<=40
				Escribir "El salario es de: ",valorHora*cantHoras
			SiNo
				Escribir "El salario es de: ",valorHora*cantHoras + (cantHoras-40)*1.5*valorHora
			FinSi
			
	FinSegun
	
	
	
	
FinAlgoritmo
