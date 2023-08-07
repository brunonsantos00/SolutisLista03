package questao62;

import java.util.Scanner;

public class Questao62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        sc.close();

        for (int i = 1; i <= linhas; i++) {
            String aux = "0" + i + " ";
            System.out.println(aux.repeat(i));
        }
    }
}
