//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.


Algoritmo ejercicio23
	
	Definir sueldo, cantVenta, precioVenta, comisiones Como Real
	Definir  i Como Entero
	comisiones=0;
	
	Escribir "Ingrese sueldo base y cantidad de ventas"
	Leer sueldo, cantVenta
	
	Para i=1 Hasta cantVenta Hacer
		Escribir "Ingrese cuanto cobro por la venta numero " i
		leer precioVenta
		comisiones= comisiones + precioVenta*0.1
	FinPara
	
	Escribir "El total a pagar por comisiones es: " comisiones
	Escribir "El sueldo total (sueldo base mas comsiones) es: " sueldo + comisiones
	
FinAlgoritmo
