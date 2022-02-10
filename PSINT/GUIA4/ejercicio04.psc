//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el
//valor más grande del vector.
//

Algoritmo ejercicio04
	
	Definir n Como Entero
	Escribir "Ingrese la cantidad de numeros"
	Leer n
	
	Dimension vec(n)
	Definir vec,i Como Entero
	
	para i=0 Hasta n-1 Hacer
		Escribir "Ingrese un numero"
		Leer vec(i)
	FinPara
	
	Escribir "El numero mas grande del vector es: " buscaMaximo(vec,n)
	
FinAlgoritmo

Funcion max<- buscaMaximo(vec,n)
	Definir max,i Como Entero
	Definir bandera Como Logico
	bandera = Falso
	para i=0 Hasta n-1 Hacer
		si bandera==Falso 
			max=vec(i) 
			bandera=Verdadero
		SiNo
			si vec(i)>max
				max=vec(i)
			FinSi
		FinSi
		
	FinPara
	
FinFuncion
	