import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        int NumFunc = scanner.nextInt();

        System.out.println("Horas trabalhadas: ");
        int horas = scanner.nextInt();

        System.out.println("Valor por hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        double salario = valorHora * horas;

        System.out.printf("SALÁRIO R$ = %.2f%n", salario);

        scanner.close();
    }
}