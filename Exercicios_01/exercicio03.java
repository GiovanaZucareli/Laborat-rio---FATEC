import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        
        //Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 
        
        Scanner obj = new Scanner (System.in);
        
        System.out.println ("Digite o salario mensal do funcionario: ");
        double salario = obj.nextDouble();
        
        System.out.println ("Digite o percentual de reajuste: ");
        double reajuste = obj.nextDouble();

        double aumento = (salario / 100) * reajuste;
        
        double novoSalario = aumento + salario;
        
        System.out.println ("Novo salario: "+novoSalario);

    }
}