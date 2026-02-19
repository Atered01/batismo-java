package NivelIntermedario.aula8ate16.herancamultipla;

public class Main {
    static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 19;
        sasuke.vila = "Konoha";
        sasuke.HabilitarSharingan();

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.idade = 29;
        kakashi.vila = "Konoha";
        kakashi.HabilitarSharingan();
        kakashi.ninjaElite();
        kakashi.liderDaVila();
    }
}
