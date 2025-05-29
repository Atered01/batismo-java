package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados não primitivos: String, Array, Class, enum
         * Objtetivo: criar um ninja, e atribuir metodos a ele.
         * */

        // Declarando a variavel ninja

        String nome = "Naruto Uzumaki";

        String nomeEmCaixaAlta = nome.toUpperCase(); // toUpperCase deixa as Sting em CAPSLOCK
        System.out.println("Esta em CAPSLOCK" + nomeEmCaixaAlta);
        System.out.println("Não esta em CAPSLOCK" + nome);

        String aldeia = "Aldeia da folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // toLowerCase deixa os textos em caixa Baixa
        System.out.println(aldeiaEmCaixaBaixa);
    }

}
