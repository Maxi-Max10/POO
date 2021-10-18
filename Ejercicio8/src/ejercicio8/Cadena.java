
package ejercicio8;


public class Cadena {
    private String frase;
    private int longi;

    public Cadena() {
    }

    public Cadena(String frase, int longi) {
        this.frase = frase;
        this.longi = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longi = this.frase.length();
    }

    public int getLongi() {
        return longi;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }
    
    

}
