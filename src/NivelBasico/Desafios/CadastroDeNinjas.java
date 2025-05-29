package NivelBasico.Desafios;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeNinjasCadastrado = 0;
        int opcao;
        String[] ninjas = new String[10];
        boolean continuar = true;

        //Loop para mostrar o menu enquando o booleando for verdadeiro
        while (continuar) {
            //Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n===== Cadastro de Ninjas ===== ");
                    System.out.println("Quantos ninjas você quer cadastrar? ");
                    opcao = sc.nextInt();
                    //Se for maior que 10
                    if (opcao > 10) {
                        System.out.println("Não é possivel cadastrar esse numero de ninjas. Voltando para o menu principal.");
                        break;
                    }
                    //Loop para cadastrar os ninjas baseando no número de desejado
                    for (int i = 0; i < opcao; i++) {
                        System.out.println("\nQuais os nomes destes ninjas? ");
                        ninjas[i] = sc.next();
                        System.out.println("Ninja " + ninjas[i] + " Cadastrada com sucesso!");
                        quantidadeDeNinjasCadastrado++;
                    }
                    System.out.println("Deseja continuar no programa? [S/N]");
                    continuar = sc.next().equalsIgnoreCase("S");
                    String resultado = continuar ? "Voltando para o menu..." : "Saindo...";
                    System.out.println(resultado);
                    break;

                case 2:
                    System.out.println("\n===== Lista de Ninja ===== ");
                    //Verifica se tem ninjas cadastrados
                    if (quantidadeDeNinjasCadastrado == 0) {
                        System.out.println("Você ainda não cadastrou nenhum ninja.");
                    }
                    //Loop para percorrer a lista de ninjas
                    for (int i = 0; i < quantidadeDeNinjasCadastrado; i++) {
                        System.out.println("Ninjas cadastrados " + ninjas[i]);
                    }
                    System.out.println("Deseja continuar no programa? [S/N]");
                    continuar = sc.next().equalsIgnoreCase("S");
                    //Usando Ternario inves do If/Else
                    resultado = continuar ? "Voltando para o menu..." : "Saindo...";
                    System.out.println(resultado);
                    break;
                case 3:
                    // Fechando o programa
                    System.out.println("\nSaindo...");
                    continuar = false;
                    break;
                default:
                    // Caso nenhuma opção seja valida
                    System.out.println("\nOpção invalida! Tente novamente.");
                    break;
            }
        }
        sc.close();
    }
}
