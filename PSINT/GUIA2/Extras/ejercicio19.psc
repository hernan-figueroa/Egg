//19. Se debe realizar un programa que:
//	1�) Pida por teclado un n�mero (entero positivo).
//	2�) Pregunte al usuario si desea introducir o no otro n�mero.
//	3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
//	4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario.



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
