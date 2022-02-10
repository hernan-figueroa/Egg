//Una verdulería ofrece las manzanas con descuento según la siguiente tabla:
//	Nº DE KILOS
//	COMPRADOS % DESCUENTO
//	0 - 2		0%
//	2.01 - 5	10%
//	5.01 - 10	15%
//	10.01 en adelante 20%

//	Determinar cuánto pagará una persona que compre manzanas en esa verdulería.


Algoritmo ejercicio10
	
	Definir kilosManzanas,precioPorKilo Como Real
	Escribir "Ingrese los kilos de manzanas y el precio por kilo"
	Leer kilosManzanas precioPorKilo
	
	si kilosManzanas >=0 y kilosManzanas<=2
		Escribir "El precio a pagar no tiene descuentos"
	SiNo
		si kilosManzanas<=5
			Escribir "El precio a pagar es: ",kilosManzanas*0.9*precioPorKilo
		SiNo
			si kilosManzanas<=10
				Escribir "El precio a pagar es: ",kilosManzanas*0.85*precioPorKilo
				
			SiNo
				Escribir "El precio a pagar es: ",kilosManzanas*0.80*precioPorKilo
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
