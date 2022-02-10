//
//Programe una función recursiva que calcule la suma de un arreglo de números enteros

Algoritmo ejercicio08
	Definir tam Como Entero
	Escribir "Ingrese un tamanio del vector"
	leer tam
	
	Dimension vec(tam)
	Definir vec Como Entero
	llenarVector(vec,tam)
	mostrarVector(vec,tam)
	Escribir "El total es " sumaRecursiva(vec,tam)
	
FinAlgoritmo

SubProceso llenarVector(vec,tam)
	Definir i Como Entero
	para i=0 Hasta tam-1 Hacer
		vec(i)= Aleatorio(0,5)
	FinPara
FinSubProceso

SubProceso mostrarVector(vec,tam)
	Definir i Como Entero
	para i=0 Hasta tam-1 Hacer
		Escribir vec(i) " " Sin Saltar
	FinPara
	Escribir ""
FinSubProceso

funcion total<- sumaRecursiva(vec,tam) // 1  2  3  4  5
	Definir total,i Como Entero
	total=0
	
	si tam<>0 Entonces
		total = vec(tam-1) + sumaRecursiva(vec,tam-1)
	FinSi
	
FinFuncion
	