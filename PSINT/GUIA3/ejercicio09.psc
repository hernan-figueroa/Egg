//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente
//manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de
//	los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
//	a e i o u
//	@ # $ % *
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la
//	codificación correspondiente. Utilice la estructura "según" para la transformación.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//		La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//		NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.


Algoritmo ejercicio09
	
	Definir frase Como Caracter
	Escribir "Ingrese la frase"
	Leer frase
	
	Escribir codificador(frase)
	
FinAlgoritmo

Funcion text<- codificador(frase)
	
	Definir text Como Caracter
	text=""
	Definir i Como Entero
	para i=0 Hasta Longitud(frase)-1 Hacer
		Segun subcadena(frase,i,i) Hacer
			"a": text = Concatenar(text,"@")
			"A": text = Concatenar(text,"@")	
			"e": text = text + "#"
			"E": text = text + "#"
			"i": text = text + "$"
			"I": text = text + "$"
			"o": text = text + "%"
			"O": text = text + "%"
			"u": text = text + "*"
			"U": text = text + "*"
			De Otro Modo:
				text = Concatenar(text, subcadena(frase,i,i))
		FinSegun
	FinPara
FinFuncion
	