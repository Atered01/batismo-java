package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternairos: são maneiras de reduzir o codigos.
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 5;
        int resultado = (5 > 3) ? 10 : 20;
        System.out.println(resultado);
        String nivelDoNinja = (numeroDeMissoes >= 10 ) ? "Esse nnja tem mais de 10 missões" : "Esse ninja tem menos de 10 misões";
        System.out.println(nivelDoNinja);
    }
}
