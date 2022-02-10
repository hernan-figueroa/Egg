//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
//y los muestre por pantalla.


Algoritmo ejercicio01
	Dimension vec1(5),vec2(5)  
	Definir vec1,vec2 Como Entero
	
	llenaVectores(vec1,vec2)
	muestraVec(vec1)
	muestraVec(vec2)
	
FinAlgoritmo

SubProceso llenaVectores(vec1,vec2)
	Definir i Como Entero
	para i=0 Hasta 4 Hacer
		vec1(i)= Aleatorio(1,9)
		vec2(i)= Aleatorio(1,9)
	FinPara
FinSubProceso

SubProceso muestraVec(vec)
	Definir i Como Entero
	para i=0 Hasta 4 Hacer
		Escribir vec(i) " " Sin Saltar
	FinPara
	Escribir " "
FinSubProceso
	