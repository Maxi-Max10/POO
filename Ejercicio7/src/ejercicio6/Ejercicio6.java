
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Cafetera datos = new Cafetera();
        
        System.out.println("Buen dia!");
        datos.llenarCafetera();
        datos.servirTaza();
        datos.agregaCafe();

    }

}
