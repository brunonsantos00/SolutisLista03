package questao6;

public class AreaCirculo {
        public static void main(String[] args) {
            int r = 5;
            double area;


// Cálculo da área utilizando Math
            area = Math.PI * (Math.pow(r,2));

            System.out.println(String.format("O valor da área é de: %.2f m²", area));

        }
}
