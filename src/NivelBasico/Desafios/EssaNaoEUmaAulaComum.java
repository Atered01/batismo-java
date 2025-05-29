package NivelBasico.Desafios;

public class EssaNaoEUmaAulaComum {
    public static void main(String[] args) {
        //Naruto
        String ninja1 = "Naruto Uzumaki";
        int idade1 = 13;
        String nomeMissao1 = "Resgatar um refém";
        char rank1 = 'C';
        boolean statusConclusao1 = false;

        // Shikamaru
        String ninja2 = "Shikamaru Nara";
        int idade2 = 16;
        String nomeMissao2 = "Interceptar informações";
        char rank2 = 'A';
        boolean statusConclusao2 = false;

        //Rock Lee
        String ninja3 = "Rock Lee";
        int idade3 = 14;
        String nomeMissao3 = "Acabar com os bandidos";
        char rank3 = 'B';
        boolean statusConclusao3 = false;

        //Ninja1
        if (idade1 >= 12 && idade1 < 15  && rank1 == 'C' || rank1 == 'D') {
            statusConclusao1 = true;
        } else if (idade1 >= 15) {
            statusConclusao1 = true;

        } else{
            statusConclusao1 = false;
        }

        //Ninja2
        if (idade2 >= 12 && idade2 < 15  && rank2 == 'C' || rank2 == 'D') {
            statusConclusao2 = true;
        } else if (idade2 >= 15) {
            statusConclusao2 = true;

        } else{
            statusConclusao2 = false;
        }

        //Ninja3
        if (idade3 >= 12 && idade3 < 15  && rank3 == 'C' || rank3 == 'D') {
            statusConclusao3 = true;
        } else if (idade3 >= 15) {
            statusConclusao3 = true;

        } else{
            statusConclusao3 = false;
        }

        System.out.println("---------------------------------------------------------");

        System.out.println("Ninja 1: " + ninja1 +" .Idade dele: " + idade1 + ". Nome de sua missão: "
                + nomeMissao1 + ". Rank: " + rank1 + ". Status: " + statusConclusao1);

        System.out.println("Ninja 2: " + ninja2 + ". Idade dele: " + idade2 + ". Nome de sua missão: "
                + nomeMissao2 + ". Rank: " + rank2 + ". Status: " + statusConclusao2);

        System.out.println("Ninja 3: " + ninja3 +". Idade dele: " + idade3 + ". Nome de sua missão: "
                + nomeMissao3 + ". Rank: " + rank3 + ". Status: " + statusConclusao3);

    }
}
