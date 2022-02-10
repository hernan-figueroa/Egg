//Programe una función que calcule el producto de un arreglo de números enteros. Para
//	esto imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los
//	valores es igual a (V[1]*V[2]*V[3]*V[4])


Algoritmo ejercicio09
	Definir tam Como Entero
	Escribir "Ingrese un tamanio del vector"
	leer tam
	
	Dimension vec(tam)
	Definir vec Como Entero
	llenarVector(vec,tam)
	mostrarVector(vec,tam)
	Escribir "El producto de los valores es: " productoDeValores(vec,tam)
	
FinAlgoritmo

SubProceso llenarVector(vec,tam)
	Definir i Como Entero
	para i=0 Hasta tam-1 Hacer
		vec(i)= Aleatorio(1,10)
	FinPara
FinSubProceso

SubProceso mostrarVector(vec,tam)
	Definir i Como Entero
	para i=0 Hasta tam-1 Hacer
		Escribir vec(i) " " Sin Saltar
	FinPara
	Escribir ""
FinSubProceso

Funcion total<- productoDeValores(vec,tam)
	Definir total,aux,i Como Entero
	total=1
	para i=0 Hasta tam-1 Hacer
		vec(i)=vec(i)*total
		total=vec(i)
	FinPara
	
FinFuncion
	