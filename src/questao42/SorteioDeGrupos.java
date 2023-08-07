package questao42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SorteioDeGrupos {
    public static void main(String[] args) {
        Random random = new Random();

        List<List<Integer>> grupos = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            List<Integer> grupo = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int numeroSorteado = random.nextInt(60); 
                grupo.add(numeroSorteado);
            }

            Collections.sort(grupo); 
            grupos.add(grupo);
        }

        exibirGrupos(grupos);
    }

    private static void exibirGrupos(List<List<Integer>> grupos) {
        System.out.println("Lista de grupos de números sorteados:");
        for (int i = 0; i < grupos.size(); i++) {
            System.out.println("Grupo " + (i + 1) + ": " + grupos.get(i));
        }
    }
}
