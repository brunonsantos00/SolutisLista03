package questao53;

import java.util.Scanner;

public class Questao53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int tabuada = sc.nextInt();

        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s X %d = %d\n", tabuada, i, tabuada*i);
        }
    }

}
