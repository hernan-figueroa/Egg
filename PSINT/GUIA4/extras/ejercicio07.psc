//Crear un programa que ordene un vector lleno de números enteros aleatorios, de menor
//a mayor. Nota: investigar el ordenamiento burbuja en el siguiente link: Ordenamiento
//	Burbuja.


Algoritmo ejercicio07
	Definir tam Como Entero
	Escribir "Ingrese un tamanio del vector"
	leer tam
	
	Dimension vec(tam)
	Definir vec Como Entero
	llenarVector(vec,tam)
	mostrarVector(vec,tam)
	deMenorAMayor(vec,tam)
	mostrarVector(vec,tam)
	
FinAlgoritmo

SubProceso llenarVector(vec,tam)
	Definir i Como Entero
	para i=0 Hasta tam-1 Hacer
		vec(i)= Aleatorio(-10,10)
	FinPara
FinSubProceso

SubProceso mostrarVector(vec,tam)
	Definir i Como Entero
	para i=0 Hasta tam-1 Hacer
		Escribir vec(i) " " Sin Saltar
	FinPara
	Escribir ""
FinSubProceso

SubProceso deMenorAMayor(vec,tam)
	Definir i,aux Como Entero
	Hacer
		
		para i=1 Hasta tam-1 Hacer
			si vec(i-1)>vec(i)
				aux=vec(i)
				vec(i)=vec(i-1)
				vec(i-1)=aux
			FinSi
		FinPara
		tam= tam-1
	Mientras Que tam<>1
	
	
FinSubProceso
	