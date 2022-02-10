/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package introJavaExtras;

/**
 *
 * @author Hernan
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vec1={0,1,2,3,4,5,6};
        int[] vec2={0,1,2,3,4,5,7};
        comparaVector(vec1, vec2);
        
    }
    public static void comparaVector(int[] vec1,int[] vec2){
        boolean esIgual=true;
        for (int i = 0; i < vec1.length; i++) {
            if(vec1[i]!=vec2[i]){
                esIgual=false;
                break;
            }
        }
        if(esIgual) System.out.println("Son iguales");
        else System.out.println("No son iguales");
        
    }
    
}
