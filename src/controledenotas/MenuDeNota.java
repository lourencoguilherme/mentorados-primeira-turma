package controledenotas;

import java.util.Scanner;

public class MenuDeNota {

    public MenuDeNota() {
    }

    public void controleDeNotas(Aluno aluno) {
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.print(aluno);
        System.out.print("Digite a materia uma das materias " + Materia.values());

        String materia = entradaDoTeclado.next();

        System.out.print("Digite a primeira nota : ");
        double primeiraNota = entradaDoTeclado.nextDouble();
        System.out.print("Digite a primeira nota : ");
        double segundaNota = entradaDoTeclado.nextDouble();

        for(NotaAluno notaAluno : aluno.getNotas() ) {
            if(notaAluno.getMateria().equals(materia)) {

            } else {
                notaAluno.setMateria(Materia.valueOf(materia));
                notaAluno.getNotas().add(primeiraNota);
                notaAluno.getNotas().add(segundaNota);
            }
        }



        System.out.print("Digite o cpf do aluno para começar: ");


    }
}
