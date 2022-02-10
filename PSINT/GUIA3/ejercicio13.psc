//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y
//que devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es
//		"asdasd". Además la función calculara el número de intentos que se ha usado para
//			loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.


Algoritmo ejercicio13
	
	Definir nombre,contrasenia Como Caracter

	Escribir "Ingrese nombre de usuario"
	Leer nombre
	Escribir "Ingrese contrasenia"
	Leer contrasenia
	Escribir Login(nombre,contrasenia)	
FinAlgoritmo

Funcion log<-Login(nombre,contrasenia)
	Definir log Como Logico
	Definir contador,i Como Entero
	contador=0
	para i=1 Hasta 3 Hacer
		si nombre=="usuario1" y contrasenia=="asdasd" Entonces
			log=Verdadero
			i=3
		SiNo
			contador=contador+1
		FinSi
		si contador==3
			log=Falso
		FinSi
		si i<>3 Entonces
			Escribir "Ingrese nombre de usuario"
			Leer nombre
			Escribir "Ingrese contrasenia"
			Leer contrasenia
		FinSi
	FinPara
FinFuncion
	