package questao47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {
    private List<Paciente> pacientes;

    public Clinica() {
        pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public int getQuantidadePacientes() {
        return pacientes.size();
    }

    public int getQuantidadeHomens() {
        int quantidadeHomens = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'M') {
                quantidadeHomens++;
            }
        }
        return quantidadeHomens;
    }

    public int getQuantidadeMulheres() {
        int quantidadeMulheres = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'F') {
                quantidadeMulheres++;
            }
        }
        return quantidadeMulheres;
    }

    public double getMediaIdadeHomens() {
        int quantidadeHomens = getQuantidadeHomens();
        int totalIdadeHomens = 0;

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'M') {
                totalIdadeHomens += paciente.getIdade();
            }
        }

        return quantidadeHomens == 0 ? 0 : (double) totalIdadeHomens / quantidadeHomens;
    }

    public int getQuantidadeMulheresAlturaPeso() {
        int quantidadeMulheresAlturaPeso = 0;

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'F' && paciente.getAltura() >= 1.60 && paciente.getAltura() <= 1.70 && paciente.getPeso() > 70) {
                quantidadeMulheresAlturaPeso++;
            }
        }

        return quantidadeMulheresAlturaPeso;
    }

    public int getQuantidadeIdade18a25() {
        int quantidadeIdade18a25 = 0;

        for (Paciente paciente : pacientes) {
            if (paciente.getIdade() >= 18 && paciente.getIdade() <= 25) {
                quantidadeIdade18a25++;
            }
        }

        return quantidadeIdade18a25;
    }

    public String getNomeMaisVelho() {
        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;

        for (Paciente paciente : pacientes) {
            if (paciente.getIdade() > idadeMaisVelho) {
                nomeMaisVelho = paciente.getNome();
                idadeMaisVelho = paciente.getIdade();
            }
        }

        return nomeMaisVelho;
    }

    public String getNomeMulherMaisBaixa() {
        String nomeMulherMaisBaixa = "";
        float alturaMulherMaisBaixa = Float.MAX_VALUE;

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'F' && paciente.getAltura() < alturaMulherMaisBaixa) {
                nomeMulherMaisBaixa = paciente.getNome();
                alturaMulherMaisBaixa = paciente.getAltura();
            }
        }

        return nomeMulherMaisBaixa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinica clinica = new Clinica();

        System.out.println("Digite os dados dos pacientes. Para encerrar, digite 'fim' no nome.");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); 

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura (m): ");
            float altura = scanner.nextFloat();

            scanner.nextLine(); 

            Paciente paciente = new Paciente(nome, sexo, peso, idade, altura);
            clinica.adicionarPaciente(paciente);
        }

        System.out.println("Relatório Clínica");
        System.out.println("Quantidade de pacientes: " + clinica.getQuantidadePacientes());
        System.out.println("Quantidade de homens: " + clinica.getQuantidadeHomens());
        System.out.println("Quantidade de mulheres: " + clinica.getQuantidadeMulheres());
        System.out.println("Média de idade dos homens: " + clinica.getMediaIdadeHomens());
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + clinica.getQuantidadeMulheresAlturaPeso());
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + clinica.getQuantidadeIdade18a25());
        System.out.println("Nome do paciente mais velho: " + clinica.getNomeMaisVelho());
        System.out.println("Nome da mulher mais baixa: " + clinica.getNomeMulherMaisBaixa());
        
        for (Paciente paciente : clinica.pacientes) {
            double imc = paciente.calcularIMC();
            System.out.println("IMC do paciente " + paciente.getNome() + ": " + imc);
        }

        scanner.close();
    }
}
