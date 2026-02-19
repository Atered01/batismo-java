package NivelIntermedario.aula8ate16.sobrecargadeconstrtutores;

//SubClasse
public class Uchiha extends Ninja implements NinjaInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Rank rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void tacarKunai() {
        System.out.println("Lancei kunai");
    }

    @Override
    public void euSou() {
        System.out.println("Meu nome é " + nome + " Uchiha");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        System.out.println("Meu QI é de " + qi);
        if (qi >= 180) {
            System.out.println("Sou um genio");
        }

        if (qi < 80) {
            System.out.println("Sou um macaco");
        }
    }
}
