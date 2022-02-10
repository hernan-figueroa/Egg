//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//	es una ?A?. Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
//		investigar la función Subcadena de Pseint.

Algoritmo ejercicio09
	
	Definir palabra, aux Como Caracter
	
	Escribir "Escriba una palabra o frase"
	Leer palabra
	
	aux = Subcadena(palabra,0,0)
	
	si aux =="A"
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
