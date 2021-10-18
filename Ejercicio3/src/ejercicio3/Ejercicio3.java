
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Operacion op = new Operacion();
      
        System.out.println("Ingrese primer número");
        op.setNum1(leer.nextDouble());
        System.out.println("Ingrese segundo número");
        op.setNum2(leer.nextDouble());
        System.out.println("SUMA: "+ op.sumar());
        System.out.println("RESTA: "+ op.restar());
        
        
        if(op.dividir()==0){
            System.out.println("Error . Esta dividiendo por 0");
        }else{
            System.out.println("DIVISION: "+ op.dividir());
        }
        if(op.multiplicar()==0){
            System.out.println("Error . Esta multiplicando por 0");
        }else{
            System.out.println("MULTIPLICACION: "+ op.multiplicar());
        }
        
        
    }
    
}
