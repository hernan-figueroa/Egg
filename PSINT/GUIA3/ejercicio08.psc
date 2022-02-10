//Realizar un procedimiento que permita realizar la división entre dos números y muestre
//el cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor
//hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el
//número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 - 13 = 37 una resta realizada
//		37 - 13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3


Algoritmo ejercicio08
	
	Definir num1,num2,cociente,residuo Como Entero
	cociente=0
	Escribir "Ingrese dos numeros"
	Leer num1,num2
	
	Hacer
		resta(num1,num2,cociente,residuo)
	Mientras Que num2<residuo
	
	Escribir "El residuo es ",residuo," y el cociente es ",cociente
	
FinAlgoritmo

SubProceso resta(num1 Por Referencia,num2,cociente Por Referencia,residuo Por Referencia)
	
	residuo=num1-num2
	num1=residuo
	cociente=cociente +1
	
FinSubProceso
	