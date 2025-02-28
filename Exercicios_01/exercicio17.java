import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Insira a nota da primeira prova: ");
        double notaProva = obj.nextDouble();
        obj.nextLine();
        
        System.out.println("Insira a nota do exercício 1: ");
        double notaExercicio1 = obj.nextDouble();
        obj.nextLine();
        
        System.out.println("Insira a nota do exercício 2: ");
        double notaExercicio2 = obj.nextDouble();
        obj.nextLine();
        
        System.out.println("Insira o valor dos pontos extras: ");
        double pontosExtras = obj.nextDouble();
        
        double mediaParcial = (((notaProva * 0.6) + ((notaExercicio1 + notaExercicio2) / 2) * 0.4)) * 0.5;
        System.out.println("Media parcial: " + mediaParcial);
        
        double valorMaximo = Math.max(((notaProva * 0.6) + (((notaExercicio1 + notaExercicio2) / 2) * 0.4)) - 5.9, 0);
        double fatorAjuste = valorMaximo / (((notaProva * 0.6) + ((notaExercicio1 + notaExercicio2) / 2) * 0.4) - 5.9);
        
        System.out.println("Fator de ajuste: " + fatorAjuste);
        double notaFinal;
        
        if (fatorAjuste == 1) {
            System.out.println("Insira a nota da API: ");
            double notaAPI = obj.nextDouble();
            notaFinal = mediaParcial + (fatorAjuste * (notaAPI * 0.5)) + pontosExtras;
            System.out.println("Nota final: " + notaFinal);
        } else {
            System.out.println("Insira a nota do exame: ");
            double notaExame = obj.nextDouble();
            double notaComExame = fatorAjuste + (notaExame * 0.3) + mediaParcial + pontosExtras;
            System.out.println("Nota final: " + notaComExame);
        }
    }
}
