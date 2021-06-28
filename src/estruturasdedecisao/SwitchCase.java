package estruturasdedecisao;

public class SwitchCase {
    public static void main(String[] args) {
        int valor = 3;
        switch (valor) {
            case 1:
                System.out.println("valor = 1");
                break;
            case 2:
                System.out.println("valor = 2");
                break;
            case 3:
                System.out.println("valor = 3");
                break;
            default:
                System.out.println("Nenhum dos 3 valores foi encontrado");
        }
    }
}
