
package unoextra1;

import java.util.Scanner;


public class Cancion {
    ServCancion a = new ServCancion();
    
    public void  cargoCancion(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese titulo de la canción");
        a.setTitulo(leer.nextLine());
        System.out.println("Ingrese autor");
        a.setAutor(leer.next());
    }
    public void mueStroC(){
        System.out.println("Autor: "+a.getAutor());
        System.out.println("Titulo: "+a.getTitulo());
    }

}
