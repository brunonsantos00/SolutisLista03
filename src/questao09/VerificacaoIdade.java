package questao09;import java.util.Scanner;public class VerificacaoIdade {    public static void main(String[] args) {        Scanner entrada = new Scanner(System.in);        System.out.print("Digite a sua idade: ");        int idade = entrada.nextInt();        if (idade >= 18) {            System.out.println("Voc� � maior de idade!");        } else {            System.out.println("Voc� � menor de idade!");        }    }}