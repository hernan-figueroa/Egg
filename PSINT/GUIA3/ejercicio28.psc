//Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros
//positivos. Si M >= N una función recursiva para MCD es:
//			MCD = M, si N =0
//				MCD = MCD (N, M mod N), si N <> 0
//					El programa le debe permitir al usuario ingresar los valores para M y N. Una función
//						recursiva es entonces llamada para calcular el MCD. El programa debe imprimir el valor
//							para el MCD. 


Algoritmo ejercicio28
	Definir n, m Como Entero
	Escribir "Ingrese m y n"
	leer m,n
	Escribir mcd(m,n)
	
FinAlgoritmo

Funcion ent<-mcd(m,n)
	Definir ent Como Entero
	si m>=n && m%n==0
		ent=n
	SiNo
		ent=mcd(n,m%n)
	FinSi
	
FinFuncion
	