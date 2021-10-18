
package ejercicio12;

import java.util.Date;
import java.util.Scanner;


public class PersonaD {
    Scanner leer = new Scanner (System.in);
    private Atributos p;
    
   public PersonaD (Atributos p){
       this.p = p;
   }
  
   public void crearPersona(){
       System.out.println("Ingrese su nombre");
       p.setNombre(leer.nextLine());
       leer.useDelimiter("[^0-9]");
       System.out.println("Ingrese fecha de nacimineto");
       int dia = Integer.valueOf(leer.next());
       int mes = Integer.valueOf(leer.next())-1;
       int anio = Integer.valueOf(leer.next())-1900;
       p.setFecha(new Date(anio,mes,dia));
   }
   
   public int calcularEdad(){
       Date fechaAc = new Date();
       Date fechaN = p.getFecha();
       if (fechaN.getMonth() > fechaAc.getMonth()) {
            return fechaAc.getYear() - fechaN.getYear() - 1;
        } else if (fechaN.getMonth() == fechaAc.getMonth()) {
            if (fechaN.getDate() > fechaAc.getDate()) {
                return fechaAc.getYear() - fechaN.getYear() - 1;
            } else {
                return fechaAc.getYear() - fechaN.getYear();
            }
        } else {
            return fechaAc.getYear() - fechaN.getYear();
        }
   }
   
   public boolean menorQue(int edad){
       int comparacion = Integer.compare(calcularEdad(), edad);
        if (comparacion < 0) {
            return true;
        } else {
            return false;
        }
   }

}
