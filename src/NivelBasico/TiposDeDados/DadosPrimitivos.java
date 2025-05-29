package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja - Naruto -
        * */

        int idade = 2147483647; // Valor maximo: 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L; // Valor maximo: 9,223,372,036,854,775,007


        System.out.println(idade); // Comando para mostrar para o usuario os dados
        System.out.println(saldoBancario);
        System.out.println(vivoOuMorto);
        System.out.println("Sadlo bancario é " + saldoBancario);
    }
}
