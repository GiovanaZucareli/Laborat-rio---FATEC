import java.util.*;
public class exercicio01{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
        
        System.out.println ("Digite o ano de nascimento: ");
        int ano = obj.nextInt();
        
        System.out.println ("Digite  o mes de nascimento: ");
        int mes = obj.nextInt();
        
        System.out.println ("Digite o dia de nascimento: ");
        int dia = obj.nextInt();
        
        System.out.println ("Digite o ano atual: ");
        int anoAtual = obj.nextInt();
        
        System.out.println ("Digite o mes atual: ");
        int mesAtual = obj.nextInt();
        
        System.out.println ("Digite o dia atual: ");
        int diaAtual = obj.nextInt();
        
        int diasNascimento = ((ano * 365) + (mes * 30) + dia);
        
        int diasAtual = ((anoAtual * 365) + (mesAtual * 30) + diaAtual);
        
        int idade = diasAtual - diasNascimento;
        
        System.out.println ("Idade em dias: " + idade);
        
     }
}