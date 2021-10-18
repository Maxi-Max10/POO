
package ejercicioextra6;

import java.util.ArrayList;
import java.util.Scanner;


public class Ahorcado {
    private ahorcadoServi a;
    Scanner leer = new Scanner (System.in);
    
    public Ahorcado (ahorcadoServi a){
        this.a = a;
    }
    
    public void crearJuego(){
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = leer.next();
        ArrayList<Character> palabraArray = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            palabraArray.add(palabra.charAt(i));
        }
        a.setLetras(palabraArray);
        System.out.println("Ingrese cantidad de turnos");
        a.setJugadas(leer.nextInt());
        a.setLetrasEn(0);
     
    }
    
    public int longitud(){
        return a.getLetras().size();
    }
    
    public boolean buscarL (char letra){
        for( char i : a.getLetras()){
            if (i==letra) {
                return true;
            }
        }
        return false;
    }
    
    public int encontradas(char letra){
        if (buscarL(letra)) {
            int repetido = 0;
            for (char i : a.getLetras()) {
                if (i==letra) {
                    repetido++;
                }
            }
            return repetido;
        }
        return 0;
    }
    
    public void letrasEncontradas(char letra) {
        System.out.println("Longitud de la palabra: " + longitud());
        if (encontradas(letra) == 0) {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            a.setJugadas(a.getJugadas() - 1);
        }
        if (encontradas(letra) > 0) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
            a.setLetrasEn(a.getLetrasEn() + encontradas(letra));
        }
         System.out.println("Numero de letras (encontradas, faltantes): (" + a.getLetrasEn() + ","
                + (longitud() - a.getLetrasEn()) + ")");
                
        System.out.println("Numero de oportunidades restantes: " + intentos());
    }

    public int intentos() {
        return a.getJugadas();
    }
    
     public boolean victoria() {
        if (a.getLetrasEn() == longitud()) {
            return true;
        }
        return false;
    }

    public boolean derrota() {
        if (a.getJugadas() == 0 && a.getLetrasEn() < longitud()) {
            return true;
        }
        return false;
    }

    public void juego() {
        crearJuego();
        while (!victoria() && !derrota()) {
            System.out.println("Ingrese una letra:");
            letrasEncontradas(leer.next().charAt(0));
        }
        if (victoria()) {
            System.out.println("Felicidades! Ha ganado!");
        }
        if (derrota()) {
            System.out.println("Lo sentimos! Ha perdido!");
        }
    }

}
