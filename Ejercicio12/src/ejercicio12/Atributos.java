package ejercicio12;


import java.util.Date;



public class Atributos {
    private Date fecha;    
    private String nombre;

    public Atributos() {
    }

    public Atributos(Date fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "___________________________________\n   Nombre: " + nombre + "\n   Fecha de nacimiento: " + fecha.getDate() + "/" + (fecha.getMonth() + 1)
                + "/" + (fecha.getYear() + 1900) + "\n________________________________";
    }
}
