//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//	caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
//		es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
//	programa mostrará después la frase final. Nota: investigar la función Longitud() y
//		Concatenar() de Pseint


Algoritmo ejercicio07
	
	Definir palabra Como Caracter
	Definir  aux Como Entero
	
	Escribir "Ingrese una palabra o frase"
	Leer palabra
	
	aux = Longitud(palabra)
	
	si aux ==4
		Escribir Concatenar(palabra,"!")
	SiNo
		Escribir Concatenar(palabra,"?")
	FinSi
	
	
FinAlgoritmo
