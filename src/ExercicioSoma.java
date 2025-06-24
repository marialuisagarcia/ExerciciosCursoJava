import java.util.Locale;
import java.util.Scanner;

public class ExercicioSoma {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite dois números: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int resultado = num1 + num2;

            System.out.println("SOMA = " + resultado);

            scanner.close();

        }
}
