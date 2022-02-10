//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
//		
//		H A B
//		I L I
//		D A D
//	Nota: recordar el uso de la función Subcadena().


Algoritmo ejercicio12
	
	Dimension mat(3,3)
	Definir mat, palabra Como caracter
	Definir i,j,x Como Entero
	x=0
	Hacer
		Escribir "Ingrese una palabra de 9 letras"
		Leer palabra
	Mientras Que Longitud(palabra)<>9
	
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			
			mat(i,j)= Subcadena(palabra,x,x)
			Escribir mat(i,j) " " Sin Saltar
			x=x+1
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo
