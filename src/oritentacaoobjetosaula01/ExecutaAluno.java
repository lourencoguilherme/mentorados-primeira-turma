package oritentacaoobjetosaula01;

public class ExecutaAluno {

    public static void main(String[] args) {
        Aluno alunoGuilherme = new Aluno("Guilherme", "1234545", 29, new int[]{1,2,3});

        int[] notas = alunoGuilherme.getNotas();

        int total = 0;

        for(int nota : notas) {
            total += nota;
        }

        System.out.println("A média de notas do " + alunoGuilherme.getNome());
        System.out.println("é: " +  total / notas.length);

        System.out.println("O aluno " + alunoGuilherme.getNome() + " tem " + alunoGuilherme.getIdade() + " anos");
    }
}
