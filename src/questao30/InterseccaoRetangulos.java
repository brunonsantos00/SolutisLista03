package questao30;

import java.util.Scanner;

public class InterseccaoRetangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas dos quatro vértices do primeiro retângulo (x1 y1 x2 y2 x3 y3 x4 y4): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        System.out.println("Digite as coordenadas dos quatro vértices do segundo retângulo (x1 y1 x2 y2 x3 y3 x4 y4): ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double a3 = scanner.nextDouble();
        double b3 = scanner.nextDouble();
        double a4 = scanner.nextDouble();
        double b4 = scanner.nextDouble();

        if (retangulosSeInterceptam(x1, y1, x2, y2, x3, y3, x4, y4, a1, b1, a2, b2, a3, b3, a4, b4)) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }

        scanner.close();
    }

    public static boolean retangulosSeInterceptam(double x1, double y1, double x2, double y2, double x3, double y3,
                                                  double x4, double y4, double a1, double b1, double a2, double b2,
                                                  double a3, double b3, double a4, double b4) {
        // Encontrar os valores mínimo e máximo de x e y para cada retângulo
        double minX1 = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        double maxX1 = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        double minY1 = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        double maxY1 = Math.max(Math.max(y1, y2), Math.max(y3, y4));

        double minX2 = Math.min(Math.min(a1, a2), Math.min(a3, a4));
        double maxX2 = Math.max(Math.max(a1, a2), Math.max(a3, a4));
        double minY2 = Math.min(Math.min(b1, b2), Math.min(b3, b4));
        double maxY2 = Math.max(Math.max(b1, b2), Math.max(b3, b4));

        // Verificar se os retângulos se interceptam
        return !(minX1 > maxX2 || maxX1 < minX2 || minY1 > maxY2 || maxY1 < minY2);
    }
}
