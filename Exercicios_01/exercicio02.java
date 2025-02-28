import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Digite a quantidade de eleitores: ");
        int qtdEleitores = obj.nextInt();

        System.out.println("Digite a quantidade de votos brancos: ");
        int brancos = obj.nextInt();

        System.out.println("Digite a quantidade de votos nulos: ");
        int nulos = obj.nextInt();

        System.out.println("Digite a quantidade de votos validos: ");
        int validos = obj.nextInt();

        double percentualBrancos = (brancos * 100.0) / qtdEleitores;
        double percentualNulos = (nulos * 100.0) / qtdEleitores;
        double percentualValidos = (validos * 100.0) / qtdEleitores;

        System.out.println("Percentual de votos brancos: "+ percentualBrancos);
        System.out.println("Percentual de votos nulos: "+ percentualNulos);
        System.out.println("Percentual de votos validos: "+ percentualValidos);

    }
}