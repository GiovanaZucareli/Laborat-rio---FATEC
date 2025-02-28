import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner (System.in);
        
        System.out.println ("Digite o custo de fabrica do carro: ");
        double custo = obj.nextDouble();
        
        double valorD = ((custo / 100) * 28);
        double valorI = ((custo / 100) * 45);
        
        double custoFinal = custo + valorD + valorI;
        
        System.out.println ("Custo final: " + custoFinal);
    }
}