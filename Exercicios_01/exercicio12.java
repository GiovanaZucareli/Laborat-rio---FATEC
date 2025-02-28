import java.util.*;
public class exercicio12{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
         
            System.out.println("Entre com o primeiro numero");
            double primeiroNum = obj.nextDouble();
            
            System.out.println("Entre com o segundo numero");
            double segundoNum = obj.nextDouble();
            
            if (primeiroNum != segundoNum){
                if (primeiroNum > segundoNum) {
                    System.out.println ("OQ primeiro numero é maior: "+primeiroNum);
                }else {
                    System.out.println("O segundo numero é maior: "+segundoNum);
                }
            }else {
                System.out.println ("Os numeros sao iguais");
            }
     }
}