package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        * Arrays: São listas para armazenar uma variavel com mesmo tipo de dado.
        * tipoDaVariavel[] nomeDaVariavel = new tipoDaVariavel[]
        * */

        //Arrays são referencias a memoria
        String[] ninjas = new String[4];
        // Index: toda a ordenação começa com 0
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";
        for (int i = 0; i < 5; i++) {
            System.out.println(ninjas[i]);
        }
        ninjas = new String[4];
        ninjas[0] = "Rock lee";
        ninjas[1] = "Kiba Inuzuka";
        ninjas[2] = "Shino Aburane";
        ninjas[3] = "Kisame Hoshigate";

        // For para fazer um loop no array
        for (int i = 0; i < 4; i++) {
            System.out.println(ninjas[i]);
        }



        //String inicializa como null
        String[] nada = new String[2];
        System.out.println(nada[0]);

        //int inicializa como 0
        int[] idades = new int[2];
        System.out.println(idades[0]);

        // Boolean inicializa como false
        boolean[] falso = new boolean[2];
        System.out.println(falso[0]);

        //Doubles inicializam com 0.0
        double[] flutuante = new double[2];
        System.out.println(flutuante[0]);


    }
}
