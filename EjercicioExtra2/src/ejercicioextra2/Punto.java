
package ejercicioextra2;

import java.util.Scanner;


public class Punto {
    PuntosServi p = new PuntosServi();
    Scanner leer = new Scanner (System.in);
    
    public void crearPuntos(){
        int x2 = -3;
        int y2 = 4;
        System.out.println("X1");
        p.setX1(leer.nextInt());
        System.out.println("Y1");
        p.setY1(leer.nextInt());
        p.setX2(x2);
        p.setY2(y2);
    }
    
   public int calculoD(){
       int x1 = p.getX1();
       int y1 = p.getY1();
       int x2 = p.getX2();
       int y2 = p.getY2();
       int d;
       int res1;
       int res2;
       int ele1;
       int ele2;
       int sumatota;
       res1 = ((x2)-(x1));
       res2 = ((y2)-(y1));
       ele1 = (int) Math.pow(res1, 2);
       ele2 = (int) Math.pow(res2, 2);
       sumatota = (ele1 + ele2);
       d = (int) Math.sqrt(sumatota);
       
       return d;
   }
    

}
