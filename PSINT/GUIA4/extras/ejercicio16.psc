//Una empresa de venta de productos por correo desea realizar una estadística de las
//ventas realizadas de cada uno de sus productos a lo largo de una semana. Distribuya
//luego 5 productos en los 5 días hábiles de la semana. Se desea conocer:
//	a. Total de ventas por cada día de la semana.
//	b. Total de ventas de cada producto a lo largo de la semana.
//	c. El producto más vendido en cada semana.
//	d. El nombre, el día de la semana y la cantidad del producto más vendido.
//El informe final tendrá un formato como el que se muestra a continuación:
//	Lunes Martes Miércoles Jueves Viernes Total producto
//	Producto 1
//	Producto 2
//	Producto 3
//	Producto 4
//	Producto 5
//	Total semana
//	Producto más
//vendido


Algoritmo ejercicio16
	Definir producto,dia Como Entero
	Dimension mat(7,6)
	Definir mat Como Entero
	llenarMatriz(mat)
	Hacer
		Escribir "Ingrese un producto y un dia(1=lunes...5=viernes). Ingrese 0 para ver informe"
		Leer producto
		si producto<>0
			Leer dia
			mat(producto-1,dia-1)=mat(producto-1,dia-1)+1
		FinSi
	
	Mientras Que producto<>0
	totalSemana(mat)
	totalProducto(mat)
	productoMasVendido(mat)
	mostrarMatriz(mat)
	
FinAlgoritmo

SubProceso llenarMatriz(mat)
	Definir i,j Como Entero
	para i=0 Hasta 6 Hacer
		para j=0 Hasta 5 Hacer
			mat(i,j)=0
		FinPara
	FinPara
FinSubProceso

SubProceso totalSemana(mat)
	Definir i,j Como Entero
	para j=0 Hasta 4 Hacer
		para i=0 Hasta 4 Hacer
			mat(5,j)=mat(5,j)+mat(i,j)
		FinPara
	FinPara
FinSubProceso

SubProceso totalProducto(mat)
	Definir i,j Como Entero
	para i=0 Hasta 4 Hacer
		para j=0 Hasta 4 Hacer
			mat(i,5)=mat(i,5)+mat(i,j)
		FinPara
	FinPara
FinSubProceso

SubProceso productoMasVendido(mat)
	Definir i,j Como Entero
	para j=0 Hasta 4 Hacer
		mat(6,j)=0
		para i=0 Hasta 4 Hacer
			si mat(i,j)>mat(6,j)
				mat(6,j)=i+1
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(mat)
	Definir i,j Como Entero
	para i=0 Hasta 6 Hacer
		si i==0 Entonces
			Escribir "              lun mar mie jue vie total"
		FinSi
		si i==5 Entonces
			Escribir "Total Semana" Sin Saltar
		SiNo
			si i==6 Entonces
				Escribir "Producto mas" Sin Saltar
			SiNo
				Escribir "Producto " i+1 "  "Sin Saltar
			FinSi
			
		FinSi
		
		para j=0 Hasta 5 Hacer
			Escribir  " | " mat(i,j) "" Sin Saltar
			si j==5 Entonces
				Escribir  " |" Sin Saltar
			FinSi
		FinPara
		Escribir ""
		si i<>6 Entonces
			Escribir "_____________|___|___|___|___|___|___|"
		FinSi
		
	FinPara
	Escribir " vendido     |   |   |   |   |   |   |"
	Escribir "_____________|___|___|___|___|___|___|"
FinSubProceso	
	