package NivelIntermedario.Aula1AteAula7.polimorfismo;

public class Uchiha extends Ninja {

    // Sobrescrevendo o metodo para Polimorfismo
    @Override
    public void habilidadeEspecial() {
        usarChakara();
        System.out.println("Estilo fogo");
    }
}
