
package ejercicio6;

import java.util.Scanner;

public class Cafetera {
    Scanner leer = new Scanner(System.in);

    private  int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }
    
    
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
       if(capacidadActual > capacidadMaxima){
           this.capacidadMaxima = capacidadMaxima;
           this.capacidadActual = capacidadMaxima;
       }else{
           this.capacidadMaxima = capacidadMaxima;
           this.capacidadActual = capacidadActual;
       }
    } 
    
    public void llenarCafetera(){
        this.capacidadActual=this.capacidadMaxima;
        System.out.println("La capacidad maxima es de: "+capacidadMaxima+" cc");
        System.out.println("--------");
        System.out.println("Llenando cafetera");
        System.out.println("--------");
        System.out.println("La capacidad actual es "+capacidadActual);
    }
    
    public void servirTaza(){
        
        System.out.println("Que cantidad de cafe desea?");
        int capacidadTaza = leer.nextInt();
        capacidadActual-=capacidadTaza;
        if(capacidadActual <= 0){
            capacidadActual = 0;
            System.out.println("-------");
            System.out.println("Cafetera llena!!");
            System.out.println("-------");
            System.out.println("La capacidad de cafe actual es de: "+capacidadActual);
        
        }else{
            System.out.println("-------");
            System.out.println("Llenando taza...");
            System.out.println("Taza llena!");
            System.out.println("La cantidad de cafe actual es de: "+capacidadActual);
            System.out.println("-------");
        }        
    }
    
    public void vaciarCafetera(){
        capacidadActual = 0;
        System.out.println("-------");
        System.out.println("Vaciando Cafetera...");
        System.out.println("-------");
    }
     
    public void agregaCafe(){
        vaciarCafetera();
        System.out.println("Agrege café");
        int llenando = leer.nextInt();
        
        if(capacidadActual > capacidadMaxima){
            System.out.println("Se excede la capacidad máxima");
        } else {
            System.out.println("-------");
            System.out.println("Llenando cafetera");
            System.out.println("-------");
            System.out.println("La cantidad de cafe actual es de: "+((capacidadActual+llenando)));

        }
    }

}

