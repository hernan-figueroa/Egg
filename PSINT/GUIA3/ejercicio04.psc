//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso
//	de la función Subcadena().
//

Algoritmo ejercicio04
	
	Definir frase,letra Como Caracter
	
	Escribir "Ingrese la frase y una letra a contar"
	Leer frase,letra
	
	Escribir "La letra ",letra," aparece ",cuentaLetras(frase,letra)," veces en la frase."
	
FinAlgoritmo

Funcion num<- cuentaLetras(frase,letra)
	
	Definir num,i,aux Como Entero
	num=0
	
	Para i=1 Hasta Longitud(frase) Hacer
		
		si Subcadena(frase,i-1,i-1)==letra 
			num = num +1
		FinSi
	FinPara
	
	
FinFuncion
	