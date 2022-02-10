//Realizar una función que calcule la suma de los dígitos de un numero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en
//		el resto de una división entre 10. Recordar el uso de la función Mod y Trunc.



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
	