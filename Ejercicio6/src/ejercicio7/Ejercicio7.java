
package ejercicio7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Persona nuevaP = new Persona();
        DecimalFormat df = new DecimalFormat("####0.00");
        int pesoi,pesod,pesom = 0;
        int mayor = 0;
        int menor = 0;
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el número de personas a cargar");
        int num = leer.nextInt();
        int contt = 1;
        int cont = 0;
        int cont1 = 0;
        int cont2 = 0;
        do{
            System.out.println("Ingrese persona "+(contt++));
            nuevaP.crearPersona();
            
            if (nuevaP.mayorEdad()) {
                System.out.println("Mayor de edad");
                mayor = mayor+1;
            }else{
                System.out.println("No es mayor de edad");
                menor= menor+1;
            }
            // calculo imc
            if (nuevaP.calcularIMC()== -1) {
                cont = cont + 1;
                
               
            }
            if (nuevaP.calcularIMC()== 0) {
                cont1 = cont1 + 1;
                
                
            }
            if (nuevaP.calcularIMC()== 1) {
                cont2 = cont2 + 1;
                
                
            }
            System.out.println("----------------------------------------------");
        }while(contt<=num);
       
        System.out.println("Personas mayores de edad: "+mayor);
        System.out.println("Persona menores de edad: "+menor);
        System.out.println("___________________________________");
        System.out.println(cont+" Estan por debajo del peso ideal");
        System.out.println(cont1+" Estan en un peso ideal");
        System.out.println(cont2+" Estan por encima del peso ideal");
       
    }
    
}
