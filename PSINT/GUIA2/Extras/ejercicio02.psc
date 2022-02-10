//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//	10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//	mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//	debe cobrar al cliente e imprimirlo por pantalla. 

Algoritmo ejercicio02
	
	Definir importe Como Real
	Definir mes Como Caracter
	
	Escribir "Ingrese un mes(en minusculas) y el importe"
	Leer mes, importe
	
	si mes=="septiembre" o mes=="octubre" o mes=="noviembre" 
		Escribir "El monto total que se debe cobrar al cliente es de: " importe*0.9
	sino
		Escribir "El monto total que se debe cobrar al cliente es de: " importe
	FinSi
	
	
FinAlgoritmo
