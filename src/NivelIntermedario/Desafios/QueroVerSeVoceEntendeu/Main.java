package NivelIntermedario.Desafios.QueroVerSeVoceEntendeu;

public class Main {
    public static void main(String[] args) {
        NinjaBasico koketsu = new NinjaBasico("Koketsu", 19, TipoHabilidade.NINJUTSU);
        koketsu.mostrarInformações();
        koketsu.exectuarHabilidade();

        NinjaAvancado rockeLee = new NinjaAvancado("Rock Lee", 20, TipoHabilidade.TAIJUTSU, "8 Portões da morte");
        rockeLee.mostrarInformações();
        rockeLee.exectuarHabilidade();
        rockeLee.exutandoEspecialidade();
    }
}
