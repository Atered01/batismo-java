package NivelIntermedario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;
    /*O metodo String vai ter que retornar uma String*/
    public String boasVindasMeuNomeE() {
        return "Oi eu sou " + nome;
    }

    //Define a idade minima para ser hokage
    /*O metodo int vai ter que retornar uma int*/
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
