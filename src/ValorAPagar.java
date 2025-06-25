import java.util.Locale;
import java.util.Scanner;

public class ValorAPagar {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da peça 1: ");
        int codigo1 = scanner.nextInt();

        System.out.println("Informe a quantidade de peças: ");
        int quantidade1 = scanner.nextInt();

        System.out.println("Valor unitário da peça 1: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        int codigo2 = scanner.nextInt();

        System.out.println("Informe a quantidade de peças: ");
        int quantidade2 = scanner.nextInt();

        System.out.println("Valor unitário da peça 2: ");
        double valor2  = scanner.nextDouble();

        double valorTotal = (quantidade1 * valor1) + (quantidade2 * valor2);
        System.out.printf("O valor a ser pago é R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
