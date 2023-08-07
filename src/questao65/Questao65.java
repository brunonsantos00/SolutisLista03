package questao65;

import java.util.Scanner;

public class Questao65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        sc.close();

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= linhas - i; j++) {
                builder.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                builder.append("*");
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}
