
package ejercicio4;

public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
//    public void crearOp(int base, int altura){
//        this.base = base;
//        this.altura = altura;
//    }
    
    public int superficieR(){
        return this.base * this.altura;
    }
    
    public int perimetroR(){
        return (this.base + this.altura)*2;
    }
    
    public void dibujar(){
        int n , m;
        String aux="";
        n = this.altura;
        m = this.base;
        for(int i=0; i<n; i++ ){
            for( int j = 0; j<m; j++){
                if(i==0 | i== n-1){
                    aux ="*";
                }else{
                    if (j == 0 | j==m-1)aux="*";
                    if (j!=0 & j!=m-1)aux= " ";            
                } 
                System.out.print(aux);
                if(j == m-1)System.out.print("\n");
            }       
     
        }
    }
    
}
