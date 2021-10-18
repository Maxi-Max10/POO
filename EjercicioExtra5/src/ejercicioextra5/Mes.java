
package ejercicioextra5;

import java.util.Scanner;


public class Mes {
    mesServi m = new mesServi();
    
    public void creoM(){
        String [] array = { "enero","febrero","marzo","abril","mayo","junio","julio,","agosto","septiembre","octubre","noviembre","diciembre"};
        m.setMes(array);
    }
    
    
    public void ingresoM(){
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");       
        String mes = leer.next();
        while (repetirMes(mes)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            mes = leer.next();
        }
        System.out.println("¡Has Acertado!");
        
    }
    public boolean repetirMes(String mes) {
        // Cambiar el numero de indice desde 0 a 11 para generar diferentes meses
        // secretos.
        String mesSecreto = m.getMes()[3];
        if (mes.equals(mesSecreto)) {
            return false;
        }
        return true;
    }

}
