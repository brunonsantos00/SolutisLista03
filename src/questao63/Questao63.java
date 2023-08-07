package questao63;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        sc.close();

        ArrayList<String> contador = new ArrayList<>();

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                builder.append(String.format("%02d", j));
                builder.append(" ");
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}
