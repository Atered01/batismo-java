package NivelIntermedario.aula8ate16.sobrecargadeconstrtutores;

//SuperClasse
public abstract class Ninja implements EstrategiaNinja {

    //TODO: Incluir dois novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Genin, Chuunin, Jounin, Ambu, Kage

    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    //Passar o enum
    Rank rank;

    public Ninja() {
    }

    //Toda Vez que inicializar um constrtuor ele se torna "imutavel"(Boa Pratica)
    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }


    // TODO: Sobrecarga Do Constrtutor chamando todos os atributos
    // Sobregarcarga de métodos não é necessario redeclarar o constrtuor so os novos atributos
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Rank rank) {
        //Referenciando ao Constrtutor acima
        this(nome, idade, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public abstract void euSou();

    //Metodo geral, todos podem usar
    public void habilidadeEspecial() {
        System.out.println("Éssa é minha habilidade especial ");
    }


    //Sobstrevendo o metodo da interface
    //Override serve para boas práticas, convenção e encontrar erros.
    @Override
    public void taticaNinja() {
        System.out.println("Essa é minha tatica");
    }

    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha inteligencia de combate");
    }

    public void inteligenciaDeCombate(int qi) {
        System.out.println("Meu QI é de " + qi);
        if (qi >= 180) {
            System.out.println("Sou um genio");
        }

        if (qi < 80) {
            System.out.println("Sou um macaco");
        }
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + " E tenho " + idade;
    }
}
