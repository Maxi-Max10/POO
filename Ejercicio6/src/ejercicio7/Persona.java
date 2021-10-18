
package ejercicio7;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Persona {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Datos per = new Datos();
    
    public void crearPersona(){
        
        System.out.println("Ingrese Nombre y Apellido: ");
        per.setNombre(leer.next());
        System.out.println("Ingrese Edad:");
        per.setEdad(leer.nextInt());
        System.out.println("Ingrese peso");
        per.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura:");
        per.setAltura(leer.nextDouble());
        System.out.println("Ingrese sexo (H=Hombre; M=Mujer; O=Otro)");
        per.setSexo(leer.next());
        if(per.getSexo().equals("H") || per.getSexo().equals("M") || per.getSexo().equals("O")){
             System.out.println("Cargado correcto");
        }else{
            System.out.println("Error. Vuelva a ingresar");
            per.setSexo(leer.next());
        }              
    }
    
    public int calcularIMC(){
        double imc = 0;
        
        
        DecimalFormat df = new DecimalFormat("####0.00");
        imc = per.getPeso()/(Math.pow(per.getAltura(), 2));
        if(imc<20){
            
            return -1;
        }
        if (imc>=20 && imc<=25) {
            
            return 0;
        }
        if(imc>25){
            
            return 1;
        }
        return 2;
     
    }
    
    
    public boolean mayorEdad(){
        if (per.getEdad()>=18) {
            return true;
        }else{
            return false;
        }
        
    }
   
     
}
