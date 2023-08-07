package questao34;

import java.util.Random;

public class GeradorDeNumerosAleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            System.out.println(rand.nextInt(100) + 1);
        }
    }
}
