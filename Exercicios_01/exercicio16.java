import java.util.*;
public class exercicio16{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
         
            int janeiro = 15000;
            int fevereiro = 23000;
            int marco = 17000;
            
            int despesaTotal = janeiro + fevereiro + marco;
            double media = despesaTotal / 3;
            
            System.out.println ("Despesa total: "+despesaTotal);
            System.out.println ("Media mensal: "+media);
        
    
     }
}