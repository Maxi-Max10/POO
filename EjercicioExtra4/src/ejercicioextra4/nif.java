
package ejercicioextra4;

import java.util.Scanner;


public class nif {
    Scanner leer = new Scanner (System.in);
    DNIServi d = new DNIServi();
    
    public void crearNif(){ 
        
        System.out.println("Ingrese DNI");
        d.setDni(leer.nextInt());
        d.setLetra(calcularnif());
     
    }
    
    public char calcularnif(){
        char[] letra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };
        return letra[calcularResto()];
    }

    public int calcularResto(){
        return (int)d.getDni()%23;
    }
    
    public void motrar(){
        System.out.print("NIF: ");
        System.out.println(d.getDni()+"-"+d.getLetra());
        
    }

}
