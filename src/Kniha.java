public class Kniha implements IMedia {

    private String nazev;
    private int rokVydani;
    private int pocetStran;

    public Kniha(String nazev, int rokVydani, int pocetStran) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.pocetStran = pocetStran;
    }

    public void vypisNazev() {
        System.out.println("Název: "+nazev);
    }
    public void vypisRokVydani() {
        System.out.println("Rok Vydani: "+rokVydani);
    }
    public void vypisMedio() {
        System.out.println("Medio: Kniha");
    }
}
