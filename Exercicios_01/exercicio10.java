import java.util.*;
public class exercicio10{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
         
         System.out.println ("Digite a nota da 1a avaliacao: ");
         double primeira = obj.nextDouble();
         
         System.out.println ("Digite a nota da 2a avaliacao: ");
         double segunda = obj.nextDouble();
         
         double media = (primeira + segunda) / 2;
         
         if (media >= 6){
             System.out.println ("O aluno foi aprovado com media: "+media);
         }else {
             System.out.println ("O aluno foi reprovado com media: "+media);
         }
 
        
     }
}