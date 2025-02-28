import java.util.*;
public class exercicio14{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
         
            System.out.println("Hora de inicio: ");
            int hrInicio = obj.nextInt();
            
            System.out.println("Hora do fim: ");
            int hrFim = obj.nextInt();
            
            int tempoTotal;
            
            if (hrFim >= hrInicio) {
                tempoTotal = hrFim - hrInicio;
            }else {
                tempoTotal = (24-hrInicio) + hrFim;
            }
            
            System.out.println ("Duracao do jogo: "+tempoTotal+"hrs");
    
     }
}