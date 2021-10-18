
package ejercicio9;




public class Metodo {
    Matematica nu = new Matematica();
    
    public void numero1(double num1){
        nu.setNum1(num1);
    }
     public void numero2(double num2){
        nu.setNum2(num2);
    }
    
    public double devolverM(){
        double num1 = nu.getNum1();
        double num2 = nu.getNum2();
        
        if (num1>num2) {
            System.out.println("El numero mayor es Numero1:");
            return num1;
        }else{
            System.out.println("El numero mayor es Numero2:");
            return num2;
        }
    } 
    
    public int devolverP(){
        double num1 = nu.getNum1();
        double num2 = nu.getNum2();
        int red1 = (int) Math.round(num1);
        int red2 = (int) Math.round(num2);
        System.out.println("Numeros Redondeados");
        System.out.println(red1);
        System.out.println(red2);
        int res;
         if (num1>num2) {
            res = (int) Math.pow(red1,red2);
             System.out.println("Resultado potencia");
            return res;
        }else{
            System.out.println("Resultado potencia");
            res = (int) Math.pow(red2,red1);
            return res;
        }
    }
    
    public int devolverR(){
        double num1 = nu.getNum1();
        double num2 = nu.getNum2();
        int red1 = (int) Math.round(num1);
        int red2 = (int) Math.round(num2);
        int res;
         if (red1>red2) {
            res = (int) Math.sqrt(red2);
             System.out.println("Resultado raiz cuadrada");
            return res;
        }else{
            System.out.println("Resultado raiz cuadrada");
            res = (int) Math.sqrt(red1);
            return res;
        }
    }

}
