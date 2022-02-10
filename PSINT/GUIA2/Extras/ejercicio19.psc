//19. Se debe realizar un programa que:
//	1º) Pida por teclado un número (entero positivo).
//	2º) Pregunte al usuario si desea introducir o no otro número.
//	3º) Repita los pasos 1º y 2º mientras que el usuario no responda n/N (no).
//	4º) Muestre por pantalla la suma de los números introducidos por el usuario.



Algoritmo ejercicio19
	Definir num, contador Como Entero
	Definir respuesta Como Caracter
	contador=0
	
	Hacer
		Escribir "Ingrese un numero"
		Leer num
		contador= contador +1
		Escribir "Quiere ingresar otro numero? si/no"
		Leer respuesta
	Mientras Que respuesta=="si"
	
	Escribir "La cantidad de numeros ingresados fue de: ",contador
	
FinAlgoritmo
