package questao49;

public class SequenciaFibonacci {

	    public static void main(String[] args) {
	        long n = 50; 

	        long primeiroNumero = 1;
	        long segundoNumero = 1;

	        System.out.println("Os " + n + " primeiros números da sequência de Fibonacci:");

	       
	        System.out.print(primeiroNumero + ", ");
	        System.out.print(segundoNumero + ", ");

	       
	        for (int i = 2; i < n; i++) {
	            long next = primeiroNumero + segundoNumero;
	            System.out.print(next + ", ");

	            
	            primeiroNumero = segundoNumero;
	            segundoNumero = next;
	        }
	    }
}
