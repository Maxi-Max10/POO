
package unoextra1;

public class ServCancion {
    
    private String Titulo;
    private String Autor;

    public ServCancion() {
    }   

    public ServCancion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }
    
//    public String toString(){
//        return "\n Autor: "+Autor+"\n Titulo: "+Titulo+"\n";
//    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

}
