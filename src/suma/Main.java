
package suma;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer valor: ");       
        int valor1 = entrada.nextInt();
        
        System.out.println("Dame el segundo valor: ");       
        int valor2 = entrada.nextInt();
        
        Suma datos = new Suma(valor1, valor2);
        datos.Imprimir();
    }
    
}
