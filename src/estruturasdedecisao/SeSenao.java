package estruturasdedecisao;

public class SeSenao {

    public static void main(String[] args) {
        int nota = 7;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        String materia = "Geografia";

        if(materia.equals("Matematica")) {
            if(nota >= 6) {
                System.out.println("Aprovado em "+materia+" com nota: " + nota);
            } else {
                System.out.println("Reprovado em "+materia+" com nota: " + nota);
            }
        } else if(nota >= 7) {
            System.out.println("Reprovado em "+materia+" com nota: " + nota);
        } else {
            System.out.println("Reprovado em "+materia+" com nota: " + nota);
        }

    }
}
