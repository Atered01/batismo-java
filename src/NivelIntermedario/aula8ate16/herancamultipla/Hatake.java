package NivelIntermedario.aula8ate16.herancamultipla;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface, HokageInterface {
    public void bemVindo() {
        System.out.println(nome + " e sou um hatake");
    }

    @Override
    public void HabilitarSharingan() {
        System.out.println("Eu sou " + nome + " e Esse é meu sharingan");
    }

    public void ninjaElite() {
        System.out.println("Eu sou " + nome + " agora sou um ninja de elite");
    }

    public void liderDaVila() {
        System.out.println("Me tornei o lider a vila");
    }
}
