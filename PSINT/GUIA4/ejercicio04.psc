//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el
//valor m�s grande del vector.
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
	