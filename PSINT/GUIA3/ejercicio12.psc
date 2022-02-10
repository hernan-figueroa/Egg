//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como
//numero entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner
//	números con decimales


Algoritmo ejercicio12
	
	Definir num Como Caracter
	Escribir "Ingrese un numero"
	Leer num
	
	Escribir "El numero ingresado fue: ",cadenaANumero(num)
	
	
FinAlgoritmo

Funcion ent<- cadenaANumero(num)
	Definir ent Como Entero	
	si Longitud(num)<=3 Entonces
		ent=convertirANumero(num)
	FinSi
	
FinFuncion
	