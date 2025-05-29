package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
        * If e ELSE - Condições
        * Objteivo: Passar o ninja de nivel de acordo com o numeros de missões
        * */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String nivel;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        //se (condição) (faça isso)
        if(numeroDeMissoes == 10 && idade > 15){
            System.out.println("Subiu para: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Subiu para: Jounin");
        } else{
            System.out.println("Continua no rank Genin");
        }

        float dinheiro = 4600;

        double xboxSs = 3000;
        double xboxSx = 4500;
        double ps5 = 3500;
        double Switch2 = 4500;

        if (dinheiro == xboxSs) {
            System.out.println("Irei comprar o Xbox SS");
        } else if (dinheiro >= xboxSx && dinheiro == 4500) {
            System.out.println("Irei comprar o Xbox SX");
        } else if (dinheiro == ps5) {
            System.out.println("Irei comprar o PS5");
        }else if (dinheiro >= Switch2) {
            System.out.println("Irei comprar o Switch2");
        }
        else{
            System.out.println("To liso");
        }

    }
}
