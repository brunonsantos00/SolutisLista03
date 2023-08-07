package questao61;

import java.util.Scanner;

public class Questao61 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        sc.close();

        for (int i = 1; i <= linhas; i++) {
            System.out.println("*".repeat(i));

        }
    }
}
