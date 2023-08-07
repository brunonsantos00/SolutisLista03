package questao20;

import java.util.Scanner;

public class VelhaNova {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();


        System.out.println("Qual o seu nome?");
        pessoa1.nome = leitura.nextLine();
        System.out.println("Qual a sua idade?");
        pessoa1.idade = leitura.nextInt();

        leitura.nextLine();

        System.out.println("Qual o nome da outra pessoa?");
        pessoa2.nome = leitura.nextLine();
        System.out.println("Qual a idade da outra pessoa?");
        pessoa2.idade = leitura.nextInt();

        if (pessoa1.idade > pessoa2.idade){
            System.out.println("A pessoa mais velha é: " + pessoa1.nome + " e a pessoa mais nova é: " + pessoa2.nome);
        }
        else if (pessoa2.idade > pessoa1.idade){
            System.out.println("A pessoa mais velha é: " + pessoa2.nome + " e a pessoa mais nova é: " + pessoa1.nome);
        }
        else{
            System.out.println("Os dois possuem a mesma idade.");
        }



    }



}
