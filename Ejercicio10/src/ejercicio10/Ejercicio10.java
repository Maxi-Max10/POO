
package ejercicio10;

import java.text.DecimalFormat;
import java.util.Arrays;


public class Ejercicio10 {
    public static void llenarVA(float [] matrizA){
        for (int i = 0; i < 50; i++) {
            matrizA[i] = (float) (Math.random()*100+1);
        }
    }
    
    public static void llenarVB(float [] matrizB){
        for (int i = 0; i < 20; i++) {
            matrizB[i] = (float) (Math.random()*100+1);
        }
    }
    public static void mostarVA(float [] matrizA){
        DecimalFormat df = new DecimalFormat("### 0.0");
        for (int i = 0; i < 50; i++) {
            System.out.print(" "+df.format(matrizA[i] ));
        }
    }
     public static void mostarVB(float [] matrizB){
        DecimalFormat df = new DecimalFormat("### 0.0");
        for (int i = 0; i < 20; i++) {
            System.out.print(" "+df.format(matrizB[i] ));
        }
    }
     public static void ordenar(float [] matrizA){
        DecimalFormat df = new DecimalFormat("### 0.0");
        Arrays.sort(matrizA);
        for (float j : matrizA) {
            System.out.print(df.format(j)+" ");
        }
     }
     public static void combinado(float[]matrizA,float[]matrizB){
        DecimalFormat df = new DecimalFormat("### 0.0");
        float var = 0.5f;
        int con = 0;       
        for (int i = 0; i < 20; i++) {
            con += 1;
            if (con<=10) {
                System.out.print(" "+df.format(matrizA[i]));
            }else{
                System.out.print(" "+var);
            }
        }
     }

    public static void main(String[] args) {
        float [] matrizA  = new float [50];      
        float [] matrizB  = new float [20];
        System.out.println("Arreglo A");
        llenarVA(matrizA);
        mostarVA(matrizA);
        System.out.println("");
        System.out.println("");
        System.out.println("Arreglo B");
        llenarVB(matrizB);
        mostarVB(matrizB);
        System.out.println(""); 
        System.out.println("");
        System.out.println("Areglo A de menor a mayor");
        ordenar(matrizA);
        System.out.println("");
        System.out.println("");
        System.out.println("Lleno arreglo B con los primeros valores del arreglo A y lleno con 0,5 las ultimas 10 posiciones");
        combinado(matrizA,matrizB);
        System.out.println("");
//        
//        System.out.println("Arreglo A");
//        for (int i = 0; i < 50; i++) {
//            matrizA[i] = (float) (Math.random()*100+1);
//            System.out.print(" "+df.format(matrizA[i] ));
//        }
//        System.out.println("");
//        System.out.println("Arreglo B");
//        for (int i = 0; i < 20; i++) {
//            matrizB[i] = (float) (Math.random()*100+1); 
//            System.out.print(" "+df.format(matrizB[i]));
//        }
//        
//        System.out.println("");
//        System.out.println("Areglo A de menor a mayor");
//        Arrays.sort(matrizA);
//        for (float j : matrizA) {
//            System.out.print(df.format(j)+" ");
//        }
//        System.out.println("");
//        System.out.println("Lleno arreglo B con los primeros valores del arreglo A y lleno con 0,5 las ultimas 10 posiciones");
//        float var = 0.5f;
//        int con = 0;       
//        for (int i = 0; i < 20; i++) {
//            con += 1;
//            if (con<=10) {
//                System.out.print(" "+df.format(matrizA[i]));
//            }else{
//                System.out.print(" "+var);
//            }
//        }
//        System.out.println(" ");
      
        
        
    }

}
