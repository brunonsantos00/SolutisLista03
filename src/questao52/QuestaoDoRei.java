package questao52;

public class QuestaoDoRei {

	public static void main(String[] args) {
        int n = 64; 

        long totalGraos = calcularQuantidadeGraos(n);

        System.out.println("O súdito teria que ganhar um total de " + totalGraos + " grãos de arroz.");
    }

    public static long calcularQuantidadeGraos(int n) {
        long primeiroTermo = 1;
        int razao = 2;

        
        return primeiroTermo * (long) (Math.pow(razao, n) - 1) / (razao - 1);
    }
}