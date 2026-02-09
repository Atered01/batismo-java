package NivelIntermedario.Desafios.QueroVerSeVoceEntendeu;

public class NinjaBasico implements Ninja {
    private String nome;
    private int idade;
    private TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoHabilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(TipoHabilidade habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformações() {
        System.out.println("Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nHabilidade: " + getHabilidade());
    }

    @Override
    public void exectuarHabilidade() {
        System.out.println("Exutando a Habilidade: " + getHabilidade());
    }
}
