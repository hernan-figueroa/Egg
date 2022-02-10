//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
//		mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
//			clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
//			correctamente
Algoritmo ejercicio17
	
	Definir clave Como Caracter
	Definir contador Como Entero
	
	contador = 0
	
	Hacer
		Escribir "Escribi la clave"
		Leer clave
		contador = contador +1
		si clave == "eureka"
			Escribir "Se ha ingresado al sistema"
			contador=4
		FinSi
		si contador==3
			Escribir "Se agotaron los intentos"
		FinSi
				
	Mientras Que contador < 3
	

FinAlgoritmo
