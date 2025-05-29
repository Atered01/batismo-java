package NivelIntermedario.Desafios;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private String statusMissao;

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

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + getNome()
        + "\nIdade: " + getIdade()
        + "\nMissao: " + getMissao()
        + "\nStatus: " + getStatusMissao());

    }
}
