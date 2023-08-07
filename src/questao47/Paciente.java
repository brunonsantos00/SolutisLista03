package questao47;

public class Paciente {
    private String nome;
    private char sexo;
    private double peso;
    private int idade;
    private float altura;

    public Paciente(String nome, char sexo, double peso, int idade, float altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }
    
    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
