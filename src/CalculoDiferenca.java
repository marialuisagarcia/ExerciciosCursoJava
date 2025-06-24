import java.util.Scanner;

public class CalculoDiferenca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros: ");

        int A = scanner.nextInt();

        int B = scanner.nextInt();

        int C = scanner.nextInt();

        int D = scanner.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("A diferença do produto A e B pelo produto C e D é: " + diferenca);

        scanner.close();
    }
}