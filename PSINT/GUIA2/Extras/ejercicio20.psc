//Hacer un algoritmo para calcular la media de los n�meros pares e impares, s�lo se
//			ingresar� diez n�meros.

Algoritmo ejercicio20
	
	Definir num,sumaPares,sumaImpares, cPares,cImpares Como Entero
	Definir mediaPar, mediaImpar Como Real
	sumaPares=0
	sumaImpares=0
	cPares=0
	cImpares=0
	Hacer
		Escribir "ingrese un numero"
		Leer num
		si num%2==0
			sumaPares=sumaPares + num
			cPares =cPares+1
		SiNo
			sumaImpares=sumaImpares + num
			cImpares=cImpares+1
		FinSi
	Mientras Que (cImpares+cPares)<>10
	
	
	si cPares<>0
		mediaPar=sumaPares/cPares
		Escribir "La media de numeros pares es: ",mediaPar
	SiNo
		Escribir "La media de numeros pares es: 0 "
	FinSi
	si cImpares<>0
		mediaImpar=sumaImpares/cImpares
		Escribir "La media de numeros impares es: ",mediaImpar
	SiNo
		Escribir "La media de numeros impares es: 0"
	FinSi

	
FinAlgoritmo
