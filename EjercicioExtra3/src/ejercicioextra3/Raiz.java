
package ejercicioextra3;

import java.util.Scanner;


public class Raiz {
    RaicesServi rs = new RaicesServi();
    Scanner leer = new Scanner (System.in);
    
    public void inserteV (){
        
        System.out.print("Valor de A: ");
        rs.setA(leer.nextInt());
        System.out.print("Valor de B: ");
        rs.setB(leer.nextInt());
        System.out.print("Valor de C: ");
        rs.setC(leer.nextInt());
    }
    
    public double getDiscriminante(){
        double a = rs.getA();
        double b = rs.getB();
        double c = rs.getC();
        return (Math.pow(b, 2))-4*a*c;
        
    }
    
    public boolean tieneRaices(){
        
        if(getDiscriminante()>=0) {
            return true;
            
        }else{
            return false;
        }
    }
    
    public boolean tieneRaiz(){
        if (getDiscriminante()==0) {
            return true;
        }else{
            return false;
        }
    }
    
    public void obtenerRaices(){
        double b = rs.getB();
        double a = rs.getA();
        double res1;
        double res2;
        if (tieneRaices()==true) {
            System.out.println("Solucion1 ");
            res1 = (-(b) + (Math.sqrt(getDiscriminante()))) / (2*a);
            System.out.println("X1= "+(int)res1);
            
            System.out.println("Solucion2 ");
            res2 = (-(b) - (Math.sqrt(getDiscriminante()))) / (2*a);
            System.out.println("X2= "+(int)res2);      
        }
        
    }
    
     public void obtenerRaiz() {
        double b = rs.getB();
        double a = rs.getA();
        if (tieneRaiz()== true) {
            double raiz = (-(b) / (2 * a));
            System.out.println("X 1,2 = " + raiz);
        }else{
            System.out.println("(Hay dos soluciones, por lo tanto hay dos raices)");
        }
        
    }
    
     public void calcular() {
        if (!tieneRaiz() && !tieneRaices()) {
            System.out.println("No tiene raices");
        } else if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        }
    }
}
