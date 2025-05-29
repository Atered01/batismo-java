package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwtchCase {
    public static void main(String[] args) {
        /*
         * SwitchCases: Servem para gerar casos especificos
         * Objetivo: Pedir pro usuario escoher entre os ninjas
         */

        //Pedir para o usuario
        Scanner sc = new Scanner(System.in);
        // Mostrar opções para o usuario
        System.out.println("Escolha um dos personagens por numero: ");
        System.out.println("1) Naruto Uzumaki");
        System.out.println("2) Sasuke Uchiha");
        System.out.println("3) Kakashi Hatake");
        // Pedindo para o usuario escolher
        int escolha = sc.nextInt();

        //Escolhas
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu ser Naruto Uzumaki, o Garoto que sonha em ser Hokage.");
                System.out.println("Naruto usou Rasengan.");
               // break;
            case 2:
                System.out.println("Você escolheu ser Sasuke Uchiha, o ultimo sobrevivente do Clâ Uchiha.");
                System.out.println("Sasuke usou Chidori.");
                break;
            case 3:
                System.out.println("Você escolheu ser Kakashi Hatake, o demonio do chakara oculto.");
                System.out.println("Kakashi usou Espada Relanpago");
                break;

            //Caso não selecione uma opão valida
            default:
                System.out.println("Você escolheu nenhuma das opções.");

        }

        sc.close();

    }
}
