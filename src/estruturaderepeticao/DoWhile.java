package estruturaderepeticao;

public class DoWhile {
    public static void main(String[] args) {
        int x = 0;

        do {
            System.out.println("Carregando : " + x);
            x++;
        } while (x < 18);

        System.out.println("Pronto pode usar o sistema! Tempo de espera: " + x);
    }
}
