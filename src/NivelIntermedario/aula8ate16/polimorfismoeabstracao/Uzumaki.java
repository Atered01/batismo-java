package NivelIntermedario.aula8ate16.polimorfismoeabstracao;

//SubClasse
public class Uzumaki extends Ninja implements NinjaInterface {

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void tacarKunai() {
        System.out.println("Lancei kunai");
    }

    //Sobscreve o método
    @Override
    public void euSou() {
        System.out.println("Meu nome é " + nome + " Uzumaki");
    }

}
