
package ejercicio11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Date fechaAc = new Date();
        Calendar c = new GregorianCalendar();
        
        //Fecha actual
        String descF = fechaAc.toString();
        System.out.println(descF); 
        //Le doy un formato a la fecha Actual
        
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String fechaForma = sdf.format(fechaAc);
        System.out.println(fechaForma);
        System.out.println("");
        
        int anio = c.get(Calendar.YEAR);
        int mes = c.get(Calendar.MONTH);
        int dia = c.get(Calendar.DATE);
        System.out.println("Ingrese Año 1 + ULTIMAS DOS CIFRAS DEL AÑO");
        anio=leer.nextInt();
        System.out.println("Ingrese MES - 1");
        mes=leer.nextInt();
        System.out.println("Ingrese DIA");
        dia=leer.nextInt();
        System.out.println("");
        Date fecha2 = new Date(anio,mes,dia);        
        String descF2 = fecha2.toString();
        System.out.println(descF2);
        System.out.println("");
        String fechaForma2 = sdf.format(fecha2);
        System.out.println(fechaForma2);
        System.out.println("");
        int anios = fechaAc.getYear()-fecha2.getYear();
        System.out.println("La diferencia es de "+anios+" años.");
// (121,7,2)
      
     
               
    }

}
