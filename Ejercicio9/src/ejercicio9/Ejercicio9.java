
package ejercicio9;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("####0.00");
        Scanner leer = new Scanner (System.in);
        Metodo numeros = new Metodo();
        
//        System.out.println("Primer numero");
        numeros.numero1(Math.random() * 20);
//        System.out.println("Ingrese Segundo numero");
        numeros.numero2(Math.random() * 20);
        System.out.println("NUMERO MAYOR");
        System.out.println(df.format(numeros.devolverM()));
        System.out.println("_________________________________");
        System.out.println("POTENCIA Y REDONDEO");
        System.out.println(numeros.devolverP());
        System.out.println("_________________________________");
        System.out.println("RAIZ CUADRADA DEL MENOR NUMERO");
        System.out.println(numeros.devolverR());
        System.out.println("_________________________________");
    }
    

}
