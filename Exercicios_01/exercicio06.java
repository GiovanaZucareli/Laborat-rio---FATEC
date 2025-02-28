import java.util.Scanner;

    public class exercicio06 {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Digite a temperatura em celcius: ");
        float celcius = obj.nextFloat();

        System.out.println("Temperatura em Fahrenheit: " +(celcius*1.8+32) );
    }
}
