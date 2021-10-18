
package ejercicio5;

import java.util.Scanner;

public class DatosU {
    CuentaB  cuenta = new CuentaB();
    
    public void crearCuenta(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese DNI (sin puntos)");
        cuenta.setDniC(leer.nextInt());
        System.out.println("Ingrese saldo");
        cuenta.setSaldoC(leer.nextDouble());
        System.out.println("Ingrtese numero de cuenta");
        cuenta.setNumeroC(leer.nextInt());
        System.out.println("Ingrese el interes");
        cuenta.setInteres(leer.nextDouble());
        leer.close();
    }
    
    public void ingresar(double ingreso){
        double saldo;
        saldo = cuenta.getSaldoC();
        cuenta.setSaldoC(saldo+ingreso);
    }
    
    public void retirar(double retiro){
        double saldo;
        saldo = cuenta.getSaldoC();
        
        if(saldo<retiro){
            cuenta.setSaldoC(0);
        }else{
            cuenta.setSaldoC(saldo-retiro);
        }
    }
    
    public void extraccionRapida(){
        
        double saldo;
        saldo = cuenta.getSaldoC();
        cuenta.setSaldoC(saldo * .8);
    }
    
    public void consultarS(){
        System.out.println(cuenta.getSaldoC());
    }
    
    public void consultarD(){
        System.out.println(cuenta.getDniC());
        System.out.println(cuenta.getSaldoC());
        System.out.println(cuenta.getInteres());
        System.out.println(cuenta.getNumeroC());
    }
}
