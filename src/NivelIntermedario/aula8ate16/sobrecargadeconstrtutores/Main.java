package NivelIntermedario.aula8ate16.sobrecargadeconstrtutores;

public class Main {
    static void main() {
        Uzumaki naruto = new Uzumaki("Naruto", 16, "Konoha", 25, Rank.KAGE);
        naruto.euSou();
        naruto.taticaNinja();
        naruto.inteligenciaDeCombate();

        Uchiha sasuke = new Uchiha("Sasuke", 17, "Konoha", 15, Rank.KAGE);
        sasuke.euSou();

        Uchiha obito = new Uchiha("Obito", 29, "Konoha", 90, Rank.KAGE);
        obito.euSou();
        obito.inteligenciaDeCombate(180);
    }
}
