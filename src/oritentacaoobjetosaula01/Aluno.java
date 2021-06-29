package oritentacaoobjetosaula01;

public class Aluno {
    private String nome;
    private String cpfOuRa;
    private int idade;
    private int[] notas;

    public Aluno() {
    }

    public Aluno(String nome, String cpfOuRa, int idade, int[] notas) {
        this.nome = nome;
        this.cpfOuRa = cpfOuRa;
        this.idade = idade;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfOuRa() {
        return cpfOuRa;
    }

    public void setCpfOuRa(String cpfOuRa) {
        this.cpfOuRa = cpfOuRa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
}
