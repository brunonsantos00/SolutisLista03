package questao29;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do vértice superior esquerdo do retângulo (x y): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do vértice inferior direito do retângulo (x y): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        if (x1 == x2 && y1 == y2) {
            System.out.println("Os pontos formam um ponto.");
            scanner.close();
            return;
        }

        if (x1 == x2) {
            System.out.println("Os pontos formam uma reta vertical.");
            scanner.close();
            return;
        }

        if (y1 == y2) {
            System.out.println("Os pontos formam uma reta horizontal.");
            scanner.close();
            return;
        }

        double area = Math.abs(x2 - x1) * Math.abs(y2 - y1);
        System.out.println("Os pontos formam um retângulo.");
        System.out.println("A área do retângulo é: " + area);

        System.out.println("Digite as coordenadas de outro ponto (x y): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        String posicao = posicaoPontoEmRelacaoRetangulo(x1, y1, x2, y2, x3, y3);
        System.out.println("O ponto está " + posicao + " do retângulo.");

        scanner.close();
    }

    public static String posicaoPontoEmRelacaoRetangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        double minX = Math.min(x1, x2);
        double maxX = Math.max(x1, x2);
        double minY = Math.min(y1, y2);
        double maxY = Math.max(y1, y2);

        if (x3 < minX && y3 > maxY) {
            return "acima e à esquerda";
        } else if (x3 >= minX && x3 <= maxX && y3 > minY) {
            return "acima";
        } else if (x3 > maxX && y3 > maxY) {
            return "acima e à direita";
        } else if (x3 < minX && y3 >= minY && y3 <= maxY) {
            return "à esquerda";
        } else if (x3 > maxX && y3 >= minY && y3 <= maxY) {
            return "à direita";
        } else if (x3 < minX && y3 < minY) {
            return "embaixo e à esquerda";
        } else if (x3 >= minX && x3 <= maxX && y3 < minY) {
            return "embaixo";
        } else if (x3 > maxX && y3 < minY) {
            return "embaixo e à direita";
        } else if ((x3 > minX && x3 < maxX && y3 > minY && y3 < maxY) || (y3 == minY || y3 == maxY || x3 == minX || x3 == maxX)) {
            return "na linha";
        } else {
            return "dentro";
        }
    }
}
