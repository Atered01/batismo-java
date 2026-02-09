package NivelIntermedario.Aula1AteAula7.polimorfismo;

public class Uzumaki extends Ninja {

    @Override
    public void habilidadeEspecial() {
        usarChakara();
        System.out.println("Rasengan");
    }

    public void modoSabio(){
        System.out.println("Modo sabio");
    }
}
