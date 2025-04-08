public class VHSKazeta implements IMedia, IAudio{

    private String nazev;
    private Interpret interpret;
    private int rokVydani;
    private int pocetSkladeb;

    public VHSKazeta(String nazev, String jmeno, int rokNarozeni, int rokVydani, int pocetSkladeb) {
        this.nazev = nazev;
        this.interpret = new Interpret(jmeno, rokNarozeni);
        this.rokVydani = rokVydani;
        this.pocetSkladeb = pocetSkladeb;
    }

    public void vypisNazev() {
        System.out.println("Název: "+nazev);
    }
    public void vypisRokVydani() {
        System.out.println("Rok vydani: "+rokVydani);
    }
    public void vypisMedio() {
        System.out.println("Medio: VHS kazeta");
    }

    public void infoAutor() {
        System.out.println("Autor: "+interpret);
    }
    public void pocetSkladeb() {
        System.out.println("počet skladeb: "+pocetSkladeb);
    }
}
