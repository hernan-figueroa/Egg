//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las
//vocales repetidas. Al final el procedimiento mostrará la frase final.


Algoritmo ejercicio24
	Definir frase Como Caracter
	Escribir "Ingrese una frase"
	Leer frase
	eliminaVocalesRepetidas(frase)
	
FinAlgoritmo

SubProceso eliminaVocalesRepetidas(frase)
	Definir i,aC,eC,iC,oC,uC  como entero
	Definir fraseFinal,letra Como Caracter
	aC=0
	eC=0
	iC=0
	oC=0
	uC=0
	fraseFinal=""
	para i=0 Hasta Longitud(frase)-1 Hacer
		letra=Subcadena(frase,i,i)
		
		Segun letra Hacer
			caso "a": aC=aC+1
				si ac==1 Entonces
					fraseFinal=fraseFinal+letra
				FinSi
			caso "e": eC=eC+1
				si ec==1 Entonces
					fraseFinal=fraseFinal+letra
				FinSi
			caso "i": iC=iC+1
				si ic==1 Entonces
					fraseFinal=fraseFinal+letra
				FinSi
			caso "o": oC=oC+1
				si oc==1 Entonces
					fraseFinal=fraseFinal+letra
				FinSi
			caso "u": uC=uC+1
				si uc==1 Entonces
					fraseFinal=fraseFinal+letra
				FinSi
			De Otro Modo:
				fraseFinal=fraseFinal+letra
		FinSegun

	FinPara
	
	Escribir fraseFinal
	
FinSubProceso
	