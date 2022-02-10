/*

• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package servicios;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    
    String nifLetras[] = new String[]{"T","R","W","A","G","M","Y","F",
    "P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    
    public NIF crearNIF(){
        int DNI;
        String letra;
        System.out.println("Ingrese su DNI");
        DNI = leer.nextInt();
        letra = nifLetras[DNI%23];
        
        return new NIF(DNI, letra);
    }
    
    public void mostrar(NIF nif){
    
        System.out.println("NIF = " + nif.getDNI() + "-" + nif.getLetra());
    }
}
