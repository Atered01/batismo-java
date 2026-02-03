package NivelIntermedario.Desafios.desafio3;

public class Uchiha extends Ninja {
    private String habilidadeEspecial;

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + getHabilidadeEspecial());
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        mostrarHabilidadeEspecial();
    }
}
