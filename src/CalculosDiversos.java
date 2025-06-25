import java.util.Locale;
import java.util.Scanner;

public class CalculosDiversos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 valores de dupla precisão: ");

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        //Cálculo da área do triângulo retângulo:
        System.out.println("Cálculo da área do triângulo retângulo: ");

        double areaTR = (A * C) / 2;
        System.out.printf("A área do triângulo retângulo é de %.3f%n%n", areaTR);

        //Área do círculo de raio C:
        System.out.println("Cálculo da área do círculo: ");

        double areaCirculo = Math.PI * Math.pow(C, 2);
        System.out.printf("A área do círculo é de %.3f%n%n", areaCirculo);

        //Área do trapézio com as bases A e B com altura C:
        System.out.println("Cálculo da área do trapézio: ");

        double areaTrapezio = (A + B) * C / 2;
        System.out.printf("A área do trapézio é de %.3f%n%n", areaTrapezio);

        //Área do quadrado que tem lado B:
        System.out.println("Cálculo da área do quadrado: ");

        double areaQuadrado = B * B;
        System.out.printf("A área do quadrado é de %.3f%n%n", areaQuadrado);

        //Área do retângulo com lados A e B:
        System.out.println("Cálculo da área do retângulo: ");

        double areaRetangulo = A * B;
        System.out.printf("A área do retângulo é de %.3f%n%n", areaRetangulo);

        scanner.close();
    }
}