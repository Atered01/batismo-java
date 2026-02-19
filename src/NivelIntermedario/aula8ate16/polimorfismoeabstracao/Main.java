package NivelIntermedario.aula8ate16.polimorfismoeabstracao;

public class Main {
    static void main() {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.euSou();
        naruto.taticaNinja();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.euSou();
    }
}
