
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Rectangulo rec = new Rectangulo();
        
        System.out.println("Ingrese tamaño de base del rectángulo");
        rec.setBase(leer.nextInt());
        System.out.println("Ingrese tamaño de altura del rectángulo");
        rec.setAltura(leer.nextInt());
        
        System.out.println("Superficie: " + rec.superficieR());
        System.out.println("Perímetro: " + rec.perimetroR());
        
        System.out.println("Dibujo rectángulo");        
        rec.dibujar();
    }
    
}
