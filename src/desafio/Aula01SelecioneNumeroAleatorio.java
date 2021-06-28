package desafio;

import java.util.Random;

public class Aula01SelecioneNumeroAleatorio {

    /*
        2 -  Preencha uma lista com 10 números
        e selecione um index dessa lista
        mostrando na tela o resultado.

     */

    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        Random gerador = new Random();
        System.out.println("Seu numero é: " + numeros[gerador.nextInt(9)]);
    }
}
