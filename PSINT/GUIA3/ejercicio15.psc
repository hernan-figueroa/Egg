//Realizar una funci�n que calcule la suma de los d�gitos de un numero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo numero de un digito de 2 cifras o m�s debemos pensar en
//		el resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.



Algoritmo ejercicio15
	
	Definir num Como entero
	Escribir "Ingrese un numero"
	Leer num
	
	Escribir "La suma de sus digitos es: ",sumaDigitos(num)
	
FinAlgoritmo

Funcion ent<-sumaDigitos(num)
	Definir ent,aux Como Entero
	ent=0
	Hacer
		aux=num%10 
		ent=ent+aux 
		aux= trunc(num/10)
		num=aux
	Mientras Que aux<>0 
	
FinFuncion
	