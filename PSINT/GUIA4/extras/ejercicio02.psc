//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados. 
//
Algoritmo ejercicio02
	Definir n Como Entero
	Escribir "Ingrese el tamanio del vector"
	Leer n
	
	Dimension vec(n)
	Definir vec Como Entero
	
	llenarVector(vec,n)
	Escribir "El total es: " sumaVector(vec,n)
	
	
FinAlgoritmo

SubProceso llenarVector(vec,n)
	Definir i Como Entero
	
	para i=0 Hasta n-1 Hacer
		Escribir "Ingrese un numero"
		leer vec(i)
	FinPara
	
FinSubProceso
Funcion ent<- sumaVector(vec,n)
	Definir ent,i Como Entero
	ent=0
	para i=0 Hasta n-1 Hacer
		ent=ent+vec(i)
	FinPara
	
	
FinFuncion
	