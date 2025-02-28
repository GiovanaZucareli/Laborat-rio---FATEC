import java.util.*;
public class exercicio15{

     public static void main(String []args){
         
         Scanner obj = new Scanner(System.in);
         
            System.out.println("Digite o numero de horas trabalhadas: ");
            int hrsTrabalhadas = obj.nextInt();
            
            System.out.println ("Digite o salario por hora: ");
            double slrHora = obj.nextDouble();
            
            int horasNormais = 160;
            double slrTotal;
            
            if (hrsTrabalhadas > horasNormais) {
                double hrExtra = slrHora * 1.5;
                int horasExtras = hrsTrabalhadas - horasNormais;
                slrTotal = (horasNormais * slrHora) + (horasExtras * hrExtra);
            }else {
                slrTotal = hrsTrabalhadas * slrHora;
            }
            
            System.out.println ("Salario total: "+slrTotal);

    
     }
}