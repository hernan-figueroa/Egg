//Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
//	usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje
//	por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
//"INCORRECTO". Nota: investigar la función Longitud() de Pseint. 

Algoritmo ejercicio06
	
	Definir palabra Como Caracter
	Definir  aux Como Entero
	
	Escribir "Escribir una frase o palabra con tamaño de hasta 65 caracteres"
	leer palabra
	
	aux = longitud(palabra)
	
	si aux<=6
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
