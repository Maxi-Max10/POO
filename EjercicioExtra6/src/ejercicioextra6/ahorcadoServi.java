
package ejercicioextra6;

import java.util.ArrayList;


public class ahorcadoServi {
   private ArrayList<Character> letras;
    private int letrasEn;
    private int jugadas;

    public ahorcadoServi() {
    }

    public ahorcadoServi(ArrayList<Character> letras, int letrasEn, int jugadas) {
        this.letras = letras;
        this.letrasEn = letrasEn;
        this.jugadas = jugadas;
    }

    public ArrayList<Character> getLetras() {
        return letras;
    }

    public void setLetras(ArrayList<Character> letras) {
        this.letras = letras;
    }

    public int getLetrasEn() {
        return letrasEn;
    }

    public void setLetrasEn(int letrasEn) {
        this.letrasEn = letrasEn;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
   @Override
     public String toString() {
        if (letras != null) {
            return "{\n   letras: " + letras.toString() + ",\n   cantidad_letras_encontradas: "
                    + letrasEn + ",\n   cantidad_turnos_jugador: " + jugadas + "\n}";
        }
        return "{\n   letras: null,\n   cantidad_letras_encontradas: " + letrasEn
                + ",\n   cantidad_turnos_jugador: " + jugadas + "\n}";
    }
   
}
