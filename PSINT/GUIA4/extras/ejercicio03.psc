//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector
//se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la
//	función Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su
//	longitud.

Algoritmo ejercicio03
	Definir tam,i Como Entero
	Escribir "Ingrese el tamanio del vector"
	leer tam
	
	Dimension vec1(tam),vec2(tam)
	Definir vec1 Como Caracter
	Definir vec2 Como Entero
	
	para i=0 Hasta tam-1 Hacer
		Escribir "Ingrese un nombre"
		leer vec1(i)
		vec2(i)=Longitud(vec1(i))
	FinPara
	
	para i=0 Hasta tam-1 Hacer
		Escribir vec1(i) " " vec2(i)

	FinPara
	
	
	
FinAlgoritmo
