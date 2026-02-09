package NivelIntermedario.Aula1AteAula7.Construtores;

public class Main {
    public static void main(String[] args) {
        Hokages hashirama = new Hokages("Hashirama",59,false);
        Hokages tobirama = new Hokages("Tobirama",60,false);

        System.out.println(hashirama.nome + "\n" +  tobirama.nome);
    }
}
