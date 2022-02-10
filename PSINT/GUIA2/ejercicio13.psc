//13. Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica
//	de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un
//	per�odo de prueba:
//		? Producir menos de 200 tornillos defectuosos.
//		? Producir m�s de 10000 tornillos sin defectos.
//	El grado de eficiencia se determina de la siguiente manera:
//		? Si no cumple ninguna de las condiciones, grado 5.
//			? Si s�lo cumple la primera condici�n, grado 6.
//				? Si s�lo cumple la segunda condici�n, grado 7.
//					? Si cumple las dos condiciones, grado 8
//					Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
//							ejercicio. No hacer todos al mismo tiempo y despu�s probar.

Algoritmo ejercicio13
	
	Definir num1,num2, aux Como Entero
	
	
	Escribir "Ingrese la cantidad de tornillos defectuosos y sin defectos producidos"
	Leer  num1 num2
	
	si num1>=200 y num2<=10000
		Escribir "Grado 5"
	SiNo
		si num1<200 y num2<=10000
			Escribir "Grado 6"
		SiNo
			si num1>=200 y num2>10000
				Escribir "Grado 7"
			SiNo
				si num1<200 y num2>10000
					Escribir "Grado 8"
				FinSi
				
			FinSi
			
		FinSi
		
	FinSi
	
	
	
FinAlgoritmo
