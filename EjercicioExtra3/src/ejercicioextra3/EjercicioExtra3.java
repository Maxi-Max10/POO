
package ejercicioextra3;


public class EjercicioExtra3 {

    public static void main(String[] args) {
        Raiz r = new Raiz();
        System.out.println("INGRESE VALORES");
        r.inserteV();
        System.out.println("VALOR DE DISCRIMINANTE");
        System.out.println(r.getDiscriminante());
        System.out.println("¿TIENE DOS SOLUCIONES? (discriminante>=0)");
        System.out.println(r.tieneRaices());
        System.out.println("¿TIENE UNA UNICA SOLUCION? (discriminante==0)");
        System.out.println(r.tieneRaiz());
        
//        System.out.println("Posibles soluciones");
//        r.obtenerRaices();
        System.out.println("Obtengo Raiz");
        r.obtenerRaiz();
        r.calcular();
        
    }

}
