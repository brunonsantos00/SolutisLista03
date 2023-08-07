import java.util.Scanner;

public class CalculadoraDivida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial da dívida: ");
        Double valorInicial = scanner.nextDouble();

        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a taxa de juros mensal (em decimal): ");
        Double jurosMensais = scanner.nextDouble();

        Double valorFinal = valorInicial * (1 + jurosMensais * meses);

        System.out.println("O valor final da dívida é: " + valorFinal);
        scanner.close();

    }
}