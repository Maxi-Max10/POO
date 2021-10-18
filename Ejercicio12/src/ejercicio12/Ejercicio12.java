package ejercicio12;

//import java.util.Date;
import java.util.Scanner;





public class Ejercicio12 {

    public static void main(String[] args) {
      
       Atributos p = new Atributos();
       PersonaD s = new PersonaD(p);
       Scanner leer = new Scanner (System.in);
       s.crearPersona();
       
        System.out.println("La edad "+p.getNombre()+ " es de "+s.calcularEdad()+" años.");
        System.out.println("Tiene menos de 26 años(true,false): "+s.menorQue(26));
        System.out.println(p);
//        Persona per = new Persona();
//        Date fechaAc = new Date();      
//        
//        System.out.println("Ingrese nombre y fecha de nacimiento 26/9/1998");
//        int dia = Integer.valueOf(leer.next());
//        int mes = Integer.valueOf(leer.next())-1;
//        int anio = Integer.valueOf(leer.next())-1900;
//        
//        Date fechaN = new Date(anio,mes,dia);
//        System.out.println("Hay una diferencia de "+(fechaAc.getYear()-fechaN.getYear())+" años");


    }

}
