package NivelIntermedario.Desafios.QueroVerSeVoceEntendeu;

public class NinjaAvancado implements Ninja {
    private String nome;
    private int idade;
    private TipoHabilidade habilidade;
    private String especialidade;


    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public String exutandoEspecialidade() {
        return "Executando técnica especial: " + getEspecialidade();
    }

    @Override
    public void mostrarInformações() {
        System.out.println("Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nHabilidade: " + getHabilidade());
    }


    @Override
    public void exectuarHabilidade() {
        System.out.println("Executando a especialidade: " + getEspecialidade());
    }

}