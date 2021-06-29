package oritentacaoobjetosaula01;

public class ExecutaAluno {

    public static void main(String[] args) {
        Aluno alunoGuilherme = new Aluno();
        alunoGuilherme.idade = 29;
        alunoGuilherme.nome = "Guilherme";
        alunoGuilherme.cpfOuRa = "1234545";
        alunoGuilherme.notas = new int[]{1,2,3};

        int[] notas = alunoGuilherme.notas;

        int total = 0;

        for(int nota : notas) {
            total += nota;
        }

        System.out.println("A média de notas do " + alunoGuilherme.nome);
        System.out.println("é: " +  total / notas.length);

        System.out.println("O aluno " + alunoGuilherme.nome + " tem " + alunoGuilherme.idade + " anos");
    }
}
