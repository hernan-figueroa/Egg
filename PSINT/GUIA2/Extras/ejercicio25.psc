//Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
//deberemos mostrar a l o H.


Algoritmo ejercicio25
	
	Definir palabra Como Caracter
	definir aux,i Como Entero
	
	Escribir "Ingrese una palabra"
	Leer palabra
	
	aux=Longitud(palabra)
	
	para i=1 Hasta aux Hacer
		
		Escribir Sin Saltar Subcadena(palabra,aux-i,aux-i) " "
		
	FinPara
	
	
FinAlgoritmo
