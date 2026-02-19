package NivelIntermedario.aula8ate16.classesabstratasxinterfaces;

public class Uzumaki extends Ninja implements NinjaInterface {

    public void tacarKunai() {
        System.out.println("Lancei kunai");
    }

    //Sobscreve o método
    @Override
    public void euSou() {
        System.out.println("Meu nome é " + nome + " Uzumaki");
    }
}
