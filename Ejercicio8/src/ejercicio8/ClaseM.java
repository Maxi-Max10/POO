
package ejercicio8;


public class ClaseM {
    Cadena cadena = new Cadena();
    
    public void crearFrase(String frase){//Puse String frase para traer lo que el usuario escribió
        cadena.setFrase(frase);
    }
//    public int mostrarL(){
//        return cadena.getLongi();
//    } 
    
    public int mostrarV(){
        int vocales = 0;
        int longitud = cadena.getLongi();
        String frase = cadena.getFrase().toUpperCase();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i,(i+1)).equals("A") || frase.substring(i,(i+1)).equals("E") || frase.substring(i,(i+1)).equals("I")
                    || frase.substring(i,(i+1)).equals("O") || frase.substring(i,(i+1)).equals("U")) {
                vocales += 1;               
            }           
        }
        return vocales;
    }
    
    public String invertirF(){
        String frase = cadena.getFrase();
        int longitud = cadena.getLongi();
        String fi = "";
        for (int i = longitud-1; i >=0; i--) {
            fi = fi + frase.charAt(i);
        }
        return fi;
    }
    
    public int vecesRepetido(String letra){
        
        String fraseM = cadena.getFrase().toUpperCase();
        String frasem = cadena.getFrase().toLowerCase();
        int longitud = cadena.getLongi();
        int repetido = 0;
        for (int i = 0; i < longitud; i++) {
            if (fraseM.substring(i,(i+1)).equals(letra) || frasem.substring(i,(i+1)).equals(letra)) {
                repetido += 1;
                
            }
        }
        if (repetido == 0) {
            System.out.println("La palabra no contiene este carácter");
            
        }else{
            System.out.println("La palabra contiene el caracter "+letra+": "+repetido+" veces repetido.");
        }
        return repetido;
    }
    
    public void compararLongutid(String frase2){
        int longitud = cadena.getLongi();
        String frase = cadena.getFrase();
        int longi2 = frase2.length();
//        boolean vf;
        if (longitud == longi2) {
            System.out.println("Tiene igual longitud");
            
        }else{
            System.out.println("No tiene la misma longitud");
           
        }
        
    }
    
    public void unirFrases(String frase2){
        String frase1 = cadena.getFrase();
        String fraseU;
        fraseU = frase1 + " " +frase2;
        System.out.println(fraseU);
    }
    
    public void reemplazar(String letra){
         
         String frase = cadena.getFrase();
         String nuevaF = "";
         int longitud = cadena.getLongi();
         for (int i = 0; i < longitud; i++) {
            if (frase.substring(i,(i+1)).equals("a") || frase.substring(i,(i+1)).equals("A")) {
                nuevaF += letra;
            }else{
                nuevaF += frase.substring(i,(i+1));
            }
         }
         System.out.println(nuevaF);
    }
    public boolean contiene(String le){
        String fraseM = cadena.getFrase().toUpperCase();
        String frasem = cadena.getFrase().toLowerCase();
        int longitud = cadena.getLongi();
        boolean vf = false;
        for (int i = 0; i < longitud; i++) {
            if (fraseM.substring(i,(i+1)).equals(le) || frasem.substring(i,(i+1)).equals(le)) {
                vf = true;
            }
         }
        return vf;
    }
  
}
