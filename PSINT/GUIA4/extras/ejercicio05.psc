//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter,
//facilitando un potencial reordenamiento del vector. Digamos que se pide ingresar el
//carácter en la posición X y la misma está ocupada, entonces de existir un espacio en
//cualquier posición X-n o X+n, desplazar los caracteres hacia la izq o hacia la derecha para
//	poder ingresar el carácter en cuestión en el lugar deseado. El procedimiento de
//	reordenamiento debe ubicar el espacio más cercano.
//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
//	H o l a m u n d o c r u e l !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con
//desplazamiento sería:
//	h o l a m u n % d o c r u e l !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//	
//	Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición
//	10 estaba más cerca de la posición 8 que el espacio de la posición 4.

Algoritmo ejercicio05

	Dimension vec(20)
	Definir vec,frase,letra Como Caracter
	Definir i,pos Como Entero
	Escribir "Ingrese frase menos de 20 letras"
	Leer frase
	
	para i=0 Hasta 19 Hacer
		si i<Longitud(frase) Entonces 
			vec(i)=Subcadena(frase,i,i) 
		SiNo
			vec(i)=" " //               
		FinSi
	FinPara
	
	Escribir "Ingrese una letra y una posicion"
	Leer letra,pos
	
	Definir aux,aux2 Como Entero
	Definir log Como Logico
	log=falso
	aux=999
	si vec(pos-1)==" "
		vec(pos-1)=letra
		para i=0 Hasta 19 Hacer
			Escribir vec(i) Sin Saltar
		FinPara
		Escribir " "
	SiNo
		para i=0 Hasta 19 Hacer
			si i<pos-1 y vec(i)==" "
				aux=pos-1-i 
			FinSi
			si i>pos-1 y vec(i)==" " y log=Falso
				aux2=i -pos-1
				log=Verdadero
			FinSi	
		FinPara	
	
		si aux<aux2 Entonces
			para i=0 Hasta pos-2 
				vec(i)=vec(i+1)
			FinPara
			vec(pos-1)=letra
		SiNo
			si pos==1 Entonces
				vec(0)=letra
			SiNo
				para i=18 Hasta pos-1 Hacer
					vec(i)=vec(i-1)
				FinPara
				vec(pos-1)=letra
			FinSi
			
		FinSi
		para i=0 Hasta 19
			Escribir vec(i) Sin Saltar
		FinPara
	FinSi
	
FinAlgoritmo