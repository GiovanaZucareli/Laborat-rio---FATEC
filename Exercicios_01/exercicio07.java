import java.util.*;
public class exercicio07{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
 
        System.out.println ("Entre com um numero: ");
        double num = obj.nextDouble();
        
        if (num > 10) {
            System.out.println ("É MAIOR QUE 10!");
        }else {
            System.out.println ("NÃO É MAIOR QUE 10!");
        }
        
     }
}