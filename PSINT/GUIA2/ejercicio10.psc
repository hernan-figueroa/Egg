//Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
//	primera letra de la frase es igual a la ultima letra de la frase. Se deberá de imprimir un
//	mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
//	"INCORRECTO".


Algoritmo ejercicio10
	
	Definir palabra, aux, aux2 Como Caracter
	Definir contador Como Entero
	
	Escribir "Escriba una palabra o frase"
	Leer palabra
	contador=Longitud(palabra)
	aux = Subcadena(palabra,0,0)
	aux2 = Subcadena(palabra,contador-1,contador-1)

	si aux == aux2
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
