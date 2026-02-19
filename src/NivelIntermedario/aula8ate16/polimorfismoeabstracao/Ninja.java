package NivelIntermedario.aula8ate16.polimorfismoeabstracao;

//SuperClasse
public abstract class Ninja implements EstrategiaNinja {
    String nome;
    int idade;
    String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public abstract void euSou();

    //Metodo geral, todos podem usar
    public void habilidadeEspecial() {
        System.out.println("Éssa é minha habilidade especial ");
    }


    //Sobstrevendo o metodo da interface
    @Override
    public void taticaNinja() {
        System.out.println("Essa é minha tatica");
    }
}
