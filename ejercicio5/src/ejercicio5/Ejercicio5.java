
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        DatosU datos = new DatosU();
        datos.crearCuenta();
        datos.consultarS();
        datos.consultarD();
        datos.extraccionRapida();
        datos.consultarS();
        datos.ingresar(1000);
        datos.consultarS();
        datos.retirar(200);
        datos.consultarS();
    }
    
}
