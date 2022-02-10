/*
Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50% 

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.

 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        float[][] alumno;
        float nota;
        alumno = new float[2][5];
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la nota " + (j+1) + " del alumno " + (i+1));
                alumno[i][j] = leer.nextFloat();
            }
        }
         calcularPonderado(alumno);
         estadoMateria(alumno);
    }
    
    public static void calcularPonderado(float [][] mat){
        
        for (int i = 0; i < 2; i++) {
            
            mat[i][4]=mat[i][0]*0.1f + mat[i][1]*0.15f + mat[i][2]*0.25f + mat[i][3]*0.50f; 
        }
        
    }
    
    public static void estadoMateria(float [][] mat){
        int aprobados=0;
        int desaprobados=0;
        for (int i = 0; i < 2; i++) {
            if(mat[i][4]>=7) aprobados++;
            else 
            desaprobados++;
        }
        
        System.out.println("La cantidad de aprobados fue de " + aprobados + " y los desaprobados fueron " + desaprobados);
    }
    
}
