package NivelIntermedario.Aula1AteAula7.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.aldeia = "Konoha";
        sasuke.habilidadeEspecial();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 19;
        naruto.aldeia = "Konoha";
        naruto.habilidadeEspecial();

    }
}
