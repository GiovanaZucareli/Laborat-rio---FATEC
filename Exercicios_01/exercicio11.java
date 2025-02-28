import java.util.*;
public class exercicio11{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
         
         System.out.println ("Digite o ano atual: ");
         int anoAtual = obj.nextInt();
         
         System.out.println ("Digite o ano de nascimento: ");
         int nascimento = obj.nextInt();
         
         int idade = anoAtual - nascimento;
         
         if (idade >= 16) {
             System.out.println ("Podera votar");
         }else {
             System.out.println ("Não podera votar");
         }

        
     }
}