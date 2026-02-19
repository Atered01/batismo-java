package NivelIntermedario.aula8ate16.polimorfismoeabstracao;

//SubClasse
public class Uchiha extends Ninja implements NinjaInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void tacarKunai() {
        System.out.println("Lancei kunai");
    }


    @Override
    public void euSou() {
        System.out.println("Meu nome é " + nome + " Uchiha");
    }
}
