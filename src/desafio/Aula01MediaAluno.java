package desafio;

public class Aula01MediaAluno {

    /*
            1 - Faça um programa que receba 4 notas e retorne a média dos alunos,
             caso a média seja menor que 7 mostre reprovado,
             se for maior aprovado.
     */

    public static void main(String[] args) {
        float[] notas = {10.00f,8.01f,6.4f,9.4f};

        float total = 0;

        for(float nota : notas) {
            total += nota;
        }

        System.out.println("Sua média é: " +  total / notas.length);
    }
}
