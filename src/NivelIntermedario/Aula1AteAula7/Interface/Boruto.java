package NivelIntermedario.Aula1AteAula7.Interface;

public class Boruto extends Uzumaki implements UzumakiHyuga {

    @Override
    public void AtivarKarma() {
        System.out.println("Eu sou " + nome + " Uzumaki e eu vou ativar meu Karma");
    }

    @Override
    public void AtivarJogan() {
        System.out.println("Ativar jogan");
    }

    @Override
    public void RasenganUzuhito() {
        System.out.println("Rasengan Uzuhito! Morra");
    }


}
