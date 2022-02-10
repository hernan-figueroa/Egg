//7. Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios.
//	Después, hacer una función que reciba los dos arreglos y diga si todos sus valores son
//		iguales o no. La función debe devolver el resultado de está validación, para mostrar el
//		mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo lógico.

Algoritmo ejercicio07
	Definir n Como Entero
	Escribir "Ingrese la cantidad de numeros"
	Leer n
	
	Dimension vec1(n),vec2(n)
	Definir vec1,vec2 Como Entero
	Definir log Como Logico
	
	llenaVector(vec1,n)
	llenaVector(vec2,n)

	Escribir "Los vectores son iguales? ", comparar(vec1,vec2,n)
	
FinAlgoritmo

SubProceso llenaVector(vec,n)
	Definir i Como Entero
	para i=0 Hasta n-1 Hacer
		vec(i)= Aleatorio(0,100)
	FinPara
FinSubProceso

Funcion log<- comparar(vec1,vec2,n)
	Definir log Como Logico
	Definir i Como Entero
	log = Verdadero
	para i=0 Hasta n-1 Hacer
		si vec1(i)<>vec2(i) 
			log=falso
		FinSi
	FinPara
FinFuncion
	