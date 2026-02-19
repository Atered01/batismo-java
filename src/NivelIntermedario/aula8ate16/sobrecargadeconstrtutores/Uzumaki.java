package NivelIntermedario.aula8ate16.sobrecargadeconstrtutores;

//SubClasse
public class Uzumaki extends Ninja implements NinjaInterface {

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Rank rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void tacarKunai() {
        System.out.println("Lancei kunai");
    }

    //Sobscreve o método
    @Override
    public void euSou() {
        System.out.println("Meu nome é " + nome + " Uzumaki");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha inteligencia de combate");
    }

}
