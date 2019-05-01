
package suma;

public class Suma {
    
    private int v1, v2, resultado;

    public Suma(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
     public void Operacion(){
         resultado = v1 +v2;
     }

   
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: "+resultado);
    }
    
     
}
