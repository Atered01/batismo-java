package NivelBasico.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        /*
         * Arrays2D: são arrays multidimensionais que lembram uma tabela
         * String[][] nomeDoArray = new String[3][3]; quantidade de colunas e linhas
         * */

        //Pense como se fosse uma tabela do excel
        String[][] ninjasEAldeias = new String[3][3];
        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";


        ninjasEAldeias[1][0] = "Areia";
        ninjasEAldeias[1][1] = "Gaara do Deserto";
        ninjasEAldeias[1][2] = "Kankuro";

        ninjasEAldeias[2][0] = "Nevoa";
        ninjasEAldeias[2][1] = "Zabusa";
        ninjasEAldeias[2][2] = "Haku";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0]);
            for (int j = 1; j < ninjasEAldeias[i].length; j++) {
                System.out.println("Ninja: " + ninjasEAldeias[i][j]);

            }

        }
    }
}
