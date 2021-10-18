
package ejercicio2;

import static java.lang.Math.PI;

public class Circunferencia {
    //Cargo Atributo
    private double radio;
    
    //creo contructor vacio
    public Circunferencia() {
    }

    //lleno contructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //metodo getter y setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //metodos
    
    public void crearCircunferencia(double radio){
        this.radio = radio;
    }
    
    public double geTarea(){
        double area;
        area = PI * Math.pow(this.radio,2);
        return area;
    }
    
    public double getPerimetro(){
        double perimetro;
        perimetro = 2 * PI * this.radio;
        return perimetro;
    }
    
}


