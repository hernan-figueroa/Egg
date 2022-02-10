//8. Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//		entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener
//			la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que
//			compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo ejercicio08
	
	Definir cantidad Como Entero
	
	Escribir "Ingrese la cantidad de llantas que quiere comprar"
	Leer cantidad
	
	si cantidad<5
		Escribir "El precio por unidad es de $3000 y el total por las ",cantidad," llantas es ",cantidad*3000 
	SiNo
		si cantidad<=10
			Escribir "El precio por unidad es de $2500 y el total por las ",cantidad," llantas es ",cantidad*2500 
		SiNo
			Escribir "El precio por unidad es de $2000 y el total por las ",cantidad," llantas es ",cantidad*2000 
		FinSi
	FinSi
	
FinAlgoritmo
