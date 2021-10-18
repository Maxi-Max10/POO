
package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {
        ClaseM frase = new ClaseM();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.println("Ingrese Frase 1");
        frase.crearFrase(leer.nextLine());
        System.out.println("____________________________________");
//        System.out.println("Su longitud es: "+frase.mostrarL());
        System.out.println("La palabra ingresada contiene: "+frase.mostrarV()+" vocales");
        System.out.println("____________________________________");
        System.out.println("Frase invertida ");
        System.out.println(frase.invertirF());
        System.out.println("____________________________________");
        System.out.println("Ingrese carácter que desea buscar");
        frase.vecesRepetido(leer.nextLine());
        System.out.println("____________________________________");
        System.out.println("Ingrese Frase 2: para comparar su longutid con Frase 1");
        frase.compararLongutid(leer.nextLine());
        System.out.println("____________________________________");
        System.out.println("Escriba una palabra para unirla con la Frase 1");
        frase.unirFrases(leer.nextLine());
        System.out.println("____________________________________");
        System.out.println("Elija un carecter ( + ; * ; ¿ ; ? ; !) SOLO SE REEMPLAZARA SI LA PALABRA INGRESADA ANTERIORMENTE CONTIENE LA LETRA A ");
        frase.reemplazar(leer.nextLine());
        System.out.println("____________________________________");
        System.out.println("Ingrese una letra para comprobar si se encuentra en la Frase 1 (VERDADERO, FALSO");
        if (frase.contiene(leer.nextLine())) {
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
    }
            

}
