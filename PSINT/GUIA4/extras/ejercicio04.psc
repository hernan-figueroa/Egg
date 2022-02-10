//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre
//0 y 20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de
//PseInt. Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos
//estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20


Algoritmo ejercicio04
	
	Dimension vec(100)
	Definir vec Como Entero
	llenarVector(vec)
	Escribir "Total deficientes: " buscaNotas(vec,0,5)
	Escribir "Total regulares: " buscaNotas(vec,6,10)
	Escribir "Total buenos: " buscaNotas(vec,11,15)
	Escribir "Total excelentes: " buscaNotas(vec,16,20)
	
	
FinAlgoritmo

SubProceso llenarVector(vec)
	Definir i Como Entero
	para i=0 Hasta 99 Hacer
		vec(i)=Aleatorio(0,20)
	FinPara
FinSubProceso

funcion ent<- buscaNotas(vec,min,max)
	Definir i,ent Como Entero
	ent=0
	para i=0 Hasta 99 Hacer
		si vec(i)>=min y vec(i)<=max Entonces
			ent = ent + 1
		FinSi
	FinPara
	
FinFuncion

	