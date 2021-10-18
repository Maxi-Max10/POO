
package ejercicioextra2;

import java.util.Scanner;


public class EjercicioExtra2 {

    public static void main(String[] args) {
        Punto pun = new Punto();
        
        Scanner leer = new Scanner (System.in);
        
    
        System.out.println("Ingrese X1, Y2. Los valores de X2= -3 , Y2=4 ");       
        pun.crearPuntos();
        System.out.println("d (P1,P2)= "+(pun.calculoD()));
    }

}
