Algoritmo integrador
	Definir muestra Como Caracter
	Escribir "Ingrese la muestra genetica"
	Leer muestra
	si esMuestraValida(muestra)==Verdadero 
		Dimension mat(RC(longitud(muestra)),RC(longitud(muestra)))
		Definir mat Como Caracter
		llenarMatriz(muestra,mat,RC(longitud(muestra)))
		mostrarMatriz(mat,RC(longitud(muestra)))
		comprobarZ(mat,RC(longitud(muestra)))
	SiNo
		Escribir "La muestra ingresada no es valida"
	FinSi
	
	
FinAlgoritmo

SubProceso comprobarZ(mat,tam)
	Definir i,j Como Entero
	Definir codigoZ Como Logico
	Definir letraAnteriorD1,letraAnteriorD2 Como Caracter
	codigoZ=Verdadero
	letraAnteriorD1=mat(0,0)
	letraAnteriorD2=mat(tam-1,0)
	para i=0 Hasta tam-1 Hacer
		si mat(i,i)<> letraAnteriorD1 Entonces
			codigoZ=falso
		SiNo
			letraAnteriorD1=mat(i,i)
		FinSi
		si mat(tam-1-i,i)<>letraAnteriorD2 Entonces
			codigoZ=falso
		SiNo
			letraAnteriorD2=mat(tam-1-i,i)
		FinSi
	FinPara
	si codigoZ==Verdadero 
		Escribir "Se ha encontrado el gen Z!!!"
	SiNo
		Escribir "No se ha encontrado el gen Z!!!"
	FinSi
FinSubProceso

SubProceso mostrarMatriz(mat,tam)
	Definir i,j Como Entero
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta tam-1 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso


SubProceso llenarMatriz(muestra,mat,tam)
	Definir i,j,z Como Entero
	z=0
	para i=0 Hasta tam-1 Hacer
		para j=0 Hasta tam-1 Hacer
			mat(i,j)=Subcadena(muestra,z,z)
			z=z+1
		FinPara
	FinPara
FinSubProceso

Funcion ok<-esMuestraValida(muestra)
	Definir ok Como Logico
	Definir i, contador Como Entero
	contador=0
	ok=Verdadero
	para i=0 Hasta Longitud(muestra)-1 Hacer
		segun Subcadena(muestra,i,i) Hacer
			Caso "A": contador=contador+1
			Caso "B": contador=contador+1
			Caso "C": contador=contador+1
			Caso "D": contador=contador+1
			De Otro Modo:
				ok=Falso
		FinSegun
	FinPara
	
	si contador<>9 y contador<>16 y contador<>1369  Entonces
		ok=falso
	FinSi
	
FinFuncion
	