
package ejercicio5;

public class CuentaB {
    private int numeroC;
    private int dniC;
    private double saldoC, interes;

    public CuentaB() {
    }

    public CuentaB(int numeroC, int dniC, double saldoC, double interes) {
        this.numeroC = numeroC;
        this.dniC = dniC;
        this.saldoC = saldoC;
        this.interes = interes;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public int getDniC() {
        return dniC;
    }

    public void setDniC(int dniC) {
        this.dniC = dniC;
    }

    public double getSaldoC() {
        return saldoC;
    }

    public void setSaldoC(double saldoC) {
        this.saldoC = saldoC;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
}
