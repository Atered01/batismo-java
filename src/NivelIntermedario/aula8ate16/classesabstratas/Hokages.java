package NivelIntermedario.aula8ate16.classesabstratas;

//Clases abstratas não podem ser instanciadas
public abstract class Hokages {
    String nome;
    int idade;
    int numeroHokage;
    boolean vivoOuNao;

    public Hokages() {
    }

    public Hokages(String nome, int idade, boolean vivoOuNao, int numeroHokage) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.numeroHokage = numeroHokage;
    }

    //Métodos Abstratatos não podem ter corpo
    public abstract void apresentarHokage();
}
