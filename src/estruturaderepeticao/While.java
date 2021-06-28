package estruturaderepeticao;

public class While {
    public static void main(String[] args) {
        int x = 0;
        while (x < 18) {
            System.out.println("Carregando : " + x);
            x++;
        }
        System.out.println("Pronto pode usar o sistema! Tempo de espera: " + x);

    }
}
