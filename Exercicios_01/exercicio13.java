import java.util.*;
public class exercicio13{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
         
            System.out.println("Entre com o primeiro numero");
            int primeiroNum = obj.nextInt();
            
            System.out.println("Entre com o segundo numero");
            int segundoNum = obj.nextInt();
            
            if (primeiroNum != segundoNum){
                if (primeiroNum < segundoNum) {
                    System.out.println (primeiroNum+"-"+segundoNum);
                }else {
                    System.out.println (segundoNum+"-"+primeiroNum);
                }
            }else {
                System.out.println ("Os numeros sao iguais");
            }
     }
}