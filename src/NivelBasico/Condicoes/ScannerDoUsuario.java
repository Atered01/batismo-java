package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scanner = é um jeito de trazer o usuario para dentro da aplicação
         * Objteivo = O usuario vai criar um ninja e vamos validar os dados
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do seu ninja?");
        String nome = sc.nextLine();
        System.out.println("Qual é a idade do seu ninja?");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " Você é bem treinado, pode sair da vila avontade.");
        }
        else {
            System.out.println(nome +" Você é muito novo, precisa ficar mais forte");
        }


        if(nome.equalsIgnoreCase("Naruto")){
            System.out.println("Naruto Uzumaki... O jinchuriki da bijuu de nove caudas, Kurama...");
            System.out.println("-Quem é você?!");
            System.out.println("Eu sou seu pai");
        }

        //Sempre fechar o Scanner
        sc.close();

    }


}
