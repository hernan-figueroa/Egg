//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y
//muestra una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se
//use dicho procedimiento.


Algoritmo ejercicio20
	Definir text Como Caracter
	Escribir "Ingrese un texto"
	Leer text
	
	convertirEspacioado(text)
	
FinAlgoritmo

SubProceso convertirEspacioado(text)
	Definir i Como Entero
	Definir espaciado Como Caracter
	espaciado=""
	para i=0 Hasta Longitud(text)-1 Hacer
		
		espaciado = Concatenar(Concatenar(espaciado,Subcadena(text,i,i))," ") 
		
	FinPara
	Escribir espaciado
	
FinSubProceso
	