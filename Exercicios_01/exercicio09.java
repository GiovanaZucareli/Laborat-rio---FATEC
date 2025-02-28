import java.util.*;
public class exercicio09{

     public static void main(String []args){
         
         double valorTotal = 0;
         
         Scanner obj = new Scanner(System.in);
 
        System.out.println ("Quantas macas foram compradas? ");
        int macas = obj.nextInt();
        
        if (macas < 12) {
            valorTotal = macas * 1.30;
        }else {
            valorTotal = macas * 1;
        }
   
    System.out.println ("Valor total: "+valorTotal);
        
     }
}