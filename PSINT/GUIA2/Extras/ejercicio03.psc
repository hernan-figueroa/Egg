//Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
//	impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares"
//	siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el
//	siguiente mensaje "Los números no son pares, o uno de ellos no es par".
//Nota: investigar la función mod de Pseint. 

Algoritmo ejercicio03
	
	Definir num1,num2 Como Entero
	Escribir "Ingrese dos numeros enteros"
	Leer num1,num2
	
	si num1%2==0 y num2%2==0
		Escribir "Ambos números son pares"
	SiNo
		Escribir "Los números no son pares, o uno de ellos no es par"
	FinSi
	
	
FinAlgoritmo
