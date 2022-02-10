//Implemente de forma recursiva una función que le dé la vuelta a una cadena de
//caracteres. NOTA: Si la cadena es un palíndromo, la cadena y su inversa coincidirán


Algoritmo ejercicio26
	Definir text Como Caracter
	Escribir "Ingrese un texto"
	leer text
	
	Escribir vueltaCadena(text)
FinAlgoritmo

Funcion aux<- vueltaCadena(text)
	
	Definir frase,aux Como Caracter
	si Longitud(text)==1
		aux=text
	SiNo
		aux=vueltaCadena(Subcadena(text,1,Longitud(text)-1)) + Subcadena(text,0,0)
	FinSi
	
FinFuncion
	