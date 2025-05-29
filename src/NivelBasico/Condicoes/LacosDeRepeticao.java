package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * LaçõsDeRepetição: Vão repetir infinitamente ou até você atingir o parametro desejado
        * WHILE = FOR
        * */

        //While
        //While (condição) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

     /*   while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("Naruto fez uns clones " + numeroDeClones);
        }*/

        // FOR

        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
            System.out.println("Naruto fez uns clones " + i );
        }
    }
}
