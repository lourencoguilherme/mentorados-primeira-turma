package controledenotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {

    private List<Aluno> alunos = new ArrayList<>();

    public Menu() {
    }

    public void iniciaMenuControleDeNotas() {
        System.out.println("Você está no menu");


        Boolean sairDoMenu = Boolean.FALSE;

        while (Boolean.FALSE.equals(sairDoMenu) ) {
            Scanner entradaDoTeclado = new Scanner(System.in);
            System.out.println("Digite 1 para cadastrar Aluno");
            System.out.println("Digite 2 para remover Aluno");
            System.out.println("Digite 3 para listar Aluno");
            System.out.println("Digite 4 para cadastrar notas");
            System.out.println("Digite 0 para sair");
            System.out.print("Digite aqui: ");

            int valorDigitado =  entradaDoTeclado.nextInt();

            if(valorDigitado == 0) {
                sairDoMenu = Boolean.TRUE;
            } else if(valorDigitado == 1) {
                cadastrarAluno();
            } else if(valorDigitado == 2) {
                removerAluno();
            } else if(valorDigitado == 3) {
                listarAluno();
            } else if(valorDigitado == 4) {
                cadastrarNotaAluno();
            }
        }
    }

    private void cadastrarNotaAluno() {
        System.out.println("Menu de cadastro de cadastro de notas");
        System.out.print("Digite o cpf do aluno para começar: ");

        Scanner entradaDoTeclado = new Scanner(System.in);

        String cpf = entradaDoTeclado.next();

        for(Aluno aluno: alunos) {
            if(aluno.getCpf().equals(cpf)) {
                MenuDeNota menuDeNota = new MenuDeNota();
                menuDeNota.controleDeNotas(aluno);
            }
        }


    }

    private void listarAluno() {
        System.out.println(alunos);
    }

    private void cadastrarAluno() {
        System.out.println("Menu de cadastro de Aluno");

        Scanner entradaDoTeclado = new Scanner(System.in);
        System.out.print("Digite o nome: ");

        String nome = entradaDoTeclado.next();

        System.out.print("Digite o cpf: ");

        String cpf = entradaDoTeclado.next();

        Aluno aluno = new Aluno(nome, cpf);

        alunos.add(aluno);

        System.out.println(aluno);
    }

    public void removerAluno() {
        System.out.println("Menu de deleção de Aluno");

        Scanner entradaDoTeclado = new Scanner(System.in);
        System.out.print("Digite o cpf do aluno que você quer remover: ");

        String cpf = entradaDoTeclado.next();

        alunos = alunos.stream().filter(aluno -> !aluno.getCpf().equals(cpf)).collect(Collectors.toList());

    }
}
