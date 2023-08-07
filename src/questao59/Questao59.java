package questao59;

public class Questao59 {

    public static void main(String[] args) {
        System.out.println("Tabuada de Multiplicação 1 a 10");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }
    }

}
