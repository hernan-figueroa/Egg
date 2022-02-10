//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa
//no le debe permitir continuar hasta que introduzca como código 1024 y como
//contraseña 4567. El programa finaliza cuando ingresa los datos correctos.


Algoritmo ejercicio18
	
	Definir codUsuario, pass, i Como Entero
	Definir correcto Como Logico
	correcto = falso
	
	Hacer
		Escribir "Ingrese codigo de usuario:"
		Leer codUsuario
		Escribir "ingrese su clave numerica"
		Leer pass
		si codUsuario==1024 y pass==4567
			correcto=Verdadero
		FinSi
		
	Mientras Que correcto==falso
	
	
FinAlgoritmo
