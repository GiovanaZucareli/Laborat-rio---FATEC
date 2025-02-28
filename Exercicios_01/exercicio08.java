import java.util.*;
public class exercicio08{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
 
        System.out.println ("Entre com um numero: ");
        double num = obj.nextDouble();
        
        if (num >= 0) {
            System.out.println ("Positivo");
        }else {
            System.out.println ("Negativo");
        }
        
     }
}