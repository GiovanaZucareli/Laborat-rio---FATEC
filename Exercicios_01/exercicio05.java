import java.util.*;
public class exercicio05{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
         
        System.out.println("Digite a quantidade de carros vendidos: ");
        int qtdCarros = obj.nextInt();
        
        System.out.println("Digite o valor total das vendas: ");
        double vlrTotal = obj.nextDouble(); 
        
        System.out.println("Digite o salario fixo: ");
        double salario = obj.nextDouble();
        
        System.out.println("Digite o valor que recebe por carro vendido: ");
        double vlrCarro = obj.nextDouble();
        
        double cmsCarro = (vlrCarro * qtdCarros);
        double percentual = cmsCarro * 0.05;
        double salarioFinal = percentual + cmsCarro + salario;
        
        System.out.println ("Salario final: "+salarioFinal);
        
        
     }
}