//Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer
//hasta que ingrese la opci�n Salir:
//	a. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera
//	aleatoria usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
//	b. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera
//	aleatoria.
//	c. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar
//elemento a elemento. Ejemplo: C = A + B
//	d. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar
//elemento a elemento. Ejemplo: C = B - A
//e. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar:
//	Vector A, B, o C.
//	f. Salir.
//NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. La
//		longitud para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo
//			se solicitar� una vez


Algoritmo ejercicio05
	
	Definir n Como Entero
	Escribir "Ingrese el tama�o de los vectores"
	Leer n
	
	Dimension vecA(n)
	Dimension vecB(n)
	Dimension vecC(n)
	Definir vecA,vecB,vecC Como Entero
	Definir letra, opc Como Caracter
	
	Hacer
		Escribir "Ingrese la opcion deseada"
		Leer letra
		Segun letra
			caso "a":llenarVector(vecA,n)
			caso "b":llenarVector(vecB,n)
			caso "c":sumaVectores(vecA,vecB,vecC,n)
			caso "d":restaVectores(vecA,vecB,vecC,n)
			caso "e": 
				Escribir "Ingrese el vector que quiere ver(a b o c)"
				leer opc
				Segun opc
					"a": mostrarVector(vecA,n)
					"b": mostrarVector(vecB,n)
					"c": mostrarVector(vecC,n)
				FinSegun
			caso "f": escribir "Salir."
		FinSegun
	Mientras Que letra<>"f"
	
	
FinAlgoritmo

SubProceso llenarVector(vec,n)
	Definir i Como Entero
	para i=0 Hasta n-1 Hacer
		vec(i)=Aleatorio(-100,100)
	FinPara
FinSubProceso

SubProceso sumaVectores(vecA,vecB,vecC,n)
	Definir i Como Entero
	para i=0 Hasta n-1 Hacer
		vecC(i)=vecA(i)+vecB(i)
	FinPara
FinSubProceso

SubProceso restaVectores(vecA,vecB,vecC,n)
	Definir i Como Entero
	para i=0 Hasta n-1 Hacer
		vecC(i)=vecB(i)-vecA(i)
	FinPara
FinSubProceso

SubProceso mostrarVector(vec,n)
	Definir i Como Entero
	para i=0 Hasta n-1 Hacer
		Escribir vec(i) " " Sin Saltar
	FinPara
	Escribir " "
FinSubProceso
