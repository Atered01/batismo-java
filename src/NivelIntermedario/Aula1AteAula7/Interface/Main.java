package NivelIntermedario.Aula1AteAula7.Interface;

public class Main {
    public static void main(String[] args) {
        // Criando o ninja naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 17;
        Naruto.aldeia = "Konoha";
        Naruto.maisChakara();

        // Criando o ninja sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Konoha";
        Sasuke.sharinganAtivado();

        int tempoFaltando = Sasuke.anosParaSeTornarHokage(50);
        System.out.println("Você tem " + Sasuke.idade + " anos e falta: " + tempoFaltando + " anos para se tornar Hokage.");

        // Criando ninja sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.idade = 19;
        Sakura.aldeia = "Konoha";
        Sakura.forcaFisica();

        //Criando ninja Hinata
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.idade = 17;
        Hinata.aldeia = "Konoha";
        Hinata.byakugan();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.aldeia = "Konoha";
        boruto.idade = 16;
        boruto.AtivarKarma();
        boruto.AtivarJogan();
        boruto.RasenganUzuhito();
        boruto.maisChakara();


    }
}
