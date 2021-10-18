
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Circunferencia circulo1 = new Circunferencia();
        
        System.out.println("Ingrese RADIO");
        circulo1.crearCircunferencia(leer.nextDouble());
        System.out.println("Area: "+ circulo1.geTarea());
        System.out.println("Perimetro: "+ circulo1.getPerimetro());
    }
    
}
