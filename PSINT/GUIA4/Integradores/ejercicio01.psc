Algoritmo ejercicio01
	Definir n Como Entero
	Escribir "Ingrese tamanio matriz"
	Leer n
	
	Dimension mat(n,n)
	Definir mat Como caracter
	Definir log Como Logico
	llenarMatriz(mat,n)
	laberinto(mat,n)
	
	log=salio(mat,0,0)
	
FinAlgoritmo

Funcion estado<- salio(mat,i,j) 
	Definir estado Como Logico

	si i==14 y j==14 Entonces
		mat(i,j)="fin"
		mostrarMatriz(mat,15)
		estado=verdadero
	sino
		
		si mat(i,j)=="@" o mat(i,j)=="x" Entonces
			estado= falso
		SiNo
			mat(i,j)="x"
			estado=salio(mat,i,j+1) 
			estado=salio(mat,i+1,j)
			estado=salio(mat,i,j-1)
			estado=salio(mat,i-1,j)
			mat(i,j)=" "
		FinSi
	FinSi
	
FinFuncion


SubProceso llenarMatriz(mat,n)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta n-1 Hacer
			mat(i,j)=" " 
		FinPara
	FinPara
FinSubProceso

SubProceso laberinto(mat,n)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta n-1 Hacer
			si i==0 | i==n-1 
				mat(i,j)="@"
			FinSi
			si j==0 | j==n-1 
				mat(i,j)="@"
			FinSi
			si i==2 & j>0 & j<n-2 
				mat(i,j)="@"
			FinSi
			si i==4 & j>1 & j<n-2 
				mat(i,j)="@"
			FinSi
			si i==6 & j<6
				mat(i,j)="@"
			FinSi
			mat(5,8)="@"
			si i==6 & j>6
				mat(i,j)="@"
			FinSi
			
			
			si i==8 & j>0 & j<n-2 
				mat(i,j)="@"
			FinSi
			si i==10 & j>1 & j<n-2 
				mat(i,j)="@"
			FinSi
			si i==8 & j<6
				mat(i,j)="@"
			FinSi
			mat(7,3)="@"
			si i==10 & j>6
				mat(i,j)="@"
			FinSi
			mat(12,2)="@"
			mat(12,3)="@"
			mat(13,4)="@"
			si i==12 & j>5
				mat(i,j)="@"
			FinSi
		FinPara
	FinPara
	mat(0,0)=" "
	mat(0,1)=" "
	mat(n-1,n-2)=" "
	mat(n-1,n-1)=" "
	
FinSubProceso

SubProceso mostrarMatriz(mat,n)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta n-1 Hacer
			Escribir mat(i,j) " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso	