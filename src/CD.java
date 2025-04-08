public class CD implements IMedia, IAudio {

    private String nazev;
;
    private Interpret zpevak;
    private int rokVydani;
    private int pocetSkladeb;

    public CD(String nazev, String jmeno, int rokNarozeni, int rokVydani, int pocetSkladeb) {
        this.nazev = nazev;
        this.zpevak = new Interpret(jmeno, rokNarozeni);
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
        System.out.println("Medio: CD");
    }

    public void infoAutor() {
        System.out.println("Autor: "+zpevak);
    }
    public void pocetSkladeb() {
        System.out.println("Pocet skladeb: "+pocetSkladeb);
    }
}
