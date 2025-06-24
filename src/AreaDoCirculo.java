import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Descubra o valor da área do círculo: ");

        double raio = scanner.nextDouble();

        double pi = 3.14159;
        double A = pi * Math.pow(raio, 2.0);


        System.out.printf("A = %.4f%n", A);
    }
}
