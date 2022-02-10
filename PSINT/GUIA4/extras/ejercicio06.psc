//Crear una función que devuelva la diferencia que hay entre el valor más chico de un
//arreglo y su valor más grande.

Algoritmo ejercicio06
	Definir tam Como Entero
	Escribir "Ingrese el tamanio del vector"
	Leer tam
	
	Dimension vec(tam)
	Definir vec Como Entero
	llenarVector(vec,tam)
	mostrarVector(vec,tam)
	
	Escribir "La diferencia es: " diferenciaMaxMin(vec,tam) 
	
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


funcion ent<- diferenciaMaxMin(vec,tam) 
	Definir ent,min,max,i Como Entero
	Definir log Como Logico
	log=falso
	para i=0 Hasta tam-1 Hacer
		si log==falso 
			min=vec(i)
			max=vec(i)
			log=Verdadero
		FinSi
		si vec(i)<min Entonces
			min=vec(i)
		FinSi
		
		si vec(i)>max Entonces
			max=vec(i)
		FinSi
	FinPara
	ent = max-min
FinFuncion
	