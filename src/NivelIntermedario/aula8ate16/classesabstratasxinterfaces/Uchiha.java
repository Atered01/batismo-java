package NivelIntermedario.aula8ate16.classesabstratasxinterfaces;

public class Uchiha extends Ninja implements NinjaInterface {
    public void tacarKunai() {
        System.out.println("Lancei kunai");
    }

    public void euSou() {
        System.out.println("Meu nome é " + nome + " Uchiha");
    }
}
