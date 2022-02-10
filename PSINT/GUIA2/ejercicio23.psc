//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
