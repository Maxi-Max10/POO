
package unoextra1;

import java.util.Scanner;


public class EjercicoExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion c = new Cancion();
        c.cargoCancion();
        System.out.println("Canción");
        c.mueStroC();
    }

}
