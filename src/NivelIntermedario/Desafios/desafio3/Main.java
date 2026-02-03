package NivelIntermedario.Desafios.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resultado;
        int maximoDeUchihas = 10;
        int escolha;
        boolean continuar = true;
        Uchiha[] uchihas = new Uchiha[maximoDeUchihas];


        while (continuar) {
            System.out.println("***CADASTRO DE UCHIHAS***");

            System.out.println("1 - Cadastrar Uchiha");
            System.out.println("2 - Visualizar um Uchiha");
            System.out.println("3 - Atualizar Habilidades do Uchiha");
            System.out.println("4 - Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("***CADASTRO DE UCHIHAS***");
                    System.out.println("\nQuantos uchihas você deseja cadastrar? ");
                    escolha = sc.nextInt();
                    if (escolha > maximoDeUchihas) {
                        System.out.println("Não é possível cadastrar mais de 10 uchihas");
                        break;
                    }
                    for (int i = 0; i < escolha; i++) {
                        System.out.println("Quais os nome deste Uchiha? ");
                        uchihas[i] = new Uchiha();
                        uchihas[i].setNome(sc.next());

                        System.out.println("Qual é a idade deste Uchiha? ");
                        uchihas[i].setIdade(sc.nextInt());

                        System.out.println("Qual é a missão deste Uchiha? ");
                        uchihas[i].setMissao(sc.next());

                        System.out.println("Qual é o nivel de dificuldade da missão deste Uchiha?");
                        uchihas[i].setNivelDeDificuldade(sc.next());

                        System.out.println("Qual é o status da missão deste Uchiha? ");
                        uchihas[i].setStatusMissao(sc.next());

                        System.out.println("Qual é a habilidade especial deste Uchiha? ");
                        uchihas[i].setHabilidadeEspecial(sc.next());

                        System.out.println("Uchiha " + uchihas[i].getNome() + " cadastrado com sucesso!");

                    }
                    System.out.println("Deseja continuar no programa? [S/N]");
                    continuar = sc.next().equalsIgnoreCase("S");
                    resultado = continuar ? "Voltando para o menu..." : "Saindo...";
                    System.out.println(resultado);

                    break;

                case 2:
                    try {
                        System.out.println("***VISUALIZAR UCHIHAS***");
                        for (int i = 0; i < maximoDeUchihas; i++) {
                            uchihas[i].mostrarInfo();

                        }
                        System.out.println("Deseja continuar no programa? [S/N]");
                        continuar = sc.next().equalsIgnoreCase("S");
                        resultado = continuar ? "Voltando para o menu..." : "Saindo...";
                        System.out.println(resultado);
                        break;
                    } catch (NullPointerException e) {
                        System.out.println("Voce ainda não cadastro nenhum Uchiha! Fechando o programa!");
                    }
                    continuar = false;
                    break;

                case 3:
                    try {
                        System.out.println("***ATUALIZAR HABILIDADES***");
                        System.out.println("\nDe qual uchiha deseja atualizar a habilidade? ");
                        for (int i = 0; i < maximoDeUchihas; i++) {
                            System.out.println("\n" + i + ")" + uchihas[i].getNome() + uchihas[i].getHabilidadeEspecial());
                            escolha = sc.nextInt();
                            if (escolha == i) {
                                System.out.println("Qual vai ser a nova habilidade? ");
                                uchihas[i].setHabilidadeEspecial(sc.next());
                                System.out.println("A nova habilidade do uchihar " + uchihas[i].getNome() + " é " + uchihas[i].getHabilidadeEspecial());
                            }
                        }
                        System.out.println("Deseja continuar no programa? [S/N]");
                        continuar = sc.next().equalsIgnoreCase("S");
                        resultado = continuar ? "Voltando para o menu..." : "Saindo...";
                        System.out.println(resultado);
                        break;
                    } catch (NullPointerException e) {
                        System.out.println("Você ainda não cadastrou nenhum uchiha! Fechando o programa!");
                    }
                    continuar = false;
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção invalida. Fechando o programa!");
                    continuar = false;
                    break;
            }
        }
        sc.close();
   /*     Uchiha sasuke = new Uchiha();


        System.out.println("Digite o nome do ninja: ");
        sasuke.setNome( sc.nextLine());

        System.out.println("Digite a idade do ninja: ");
        sasuke.setIdade( sc.nextInt());

        System.out.println("Digite a missão do ninja: ");
        sasuke.setMissao(sc.nextLine());

        System.out.println("Digite o status da missão do ninja do ninja: ");
        sasuke.setStatusMissao(sc.nextLine());

        System.out.println("Digite a habiliade deste ninja");
        sasuke.setHabilidadeEspecial(sc.nextLine());

        sasuke.mostrarInfo();*/

    }
}
