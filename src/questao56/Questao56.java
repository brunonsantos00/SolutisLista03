package questao56;

import java.util.Scanner;

public class Questao56 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Candidato 1: ");
        String candidato1 = scanner.nextLine();

        System.out.print("Digite o nome do Candidato 2: ");
        String candidato2 = scanner.nextLine();

        System.out.print("Digite o nome do Candidato 3: ");
        String candidato3 = scanner.nextLine();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;

        char continuar = 's';
        while (continuar == 's' || continuar == 'S') {
            System.out.println("Digite o número do candidato (1, 2, 3) ou 0 para voto em branco:");
            System.out.println("Para sair a qualquer momento, digite 's'.");

            String votoStr = scanner.next();

            if (votoStr.equalsIgnoreCase("s")) {
                break; // Sair do loop se o usuário digitar 's' para sair
            }

            int voto;
            try {
                voto = Integer.parseInt(votoStr);
            } catch (NumberFormatException e) {
                System.out.println("Voto inválido.");
                continue; // Continuar para próxima iteração do loop
            }

            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else if (voto == 0) {
                votosEmBranco++;
            } else {
                System.out.println("Voto inválido.");
                continue;
            }

            totalVotos++;
        }

        scanner.close();

        double percentualCandidato1 = (double) votosCandidato1 / totalVotos * 100;
        double percentualCandidato2 = (double) votosCandidato2 / totalVotos * 100;
        double percentualCandidato3 = (double) votosCandidato3 / totalVotos * 100;
        double percentualVotosEmBranco = (double) votosEmBranco / totalVotos * 100;

        System.out.println("\nRESULTADO DA ELEIÇÃO");
        System.out.println("===============================");
        System.out.println("Total de votos: " + totalVotos);
        System.out.printf("%s: %d votos (%.2f%%)\n", candidato1, votosCandidato1, percentualCandidato1);
        System.out.printf("%s: %d votos (%.2f%%)\n", candidato2, votosCandidato2, percentualCandidato2);
        System.out.printf("%s: %d votos (%.2f%%)\n", candidato3, votosCandidato3, percentualCandidato3);
        System.out.printf("Votos em branco: %d votos (%.2f%%)\n", votosEmBranco, percentualVotosEmBranco);

        String ganhador = "Empate";
        int maiorVotos = Math.max(votosCandidato1, Math.max(votosCandidato2, votosCandidato3));

        if (maiorVotos == votosCandidato1) {
            ganhador = candidato1;
        } else if (maiorVotos == votosCandidato2) {
            ganhador = candidato2;
        } else if (maiorVotos == votosCandidato3) {
            ganhador = candidato3;
        }

        System.out.println("===============================");
        System.out.println("Ganhador: " + ganhador);
    }
}
