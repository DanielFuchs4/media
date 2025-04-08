public class DVD implements IMedia {

    private String nazev;
    private int rokVydani;
    private int delkaTrvani;

    public DVD(int rokVydani, int delkaTrvani, String nazev) {
        this.rokVydani = rokVydani;
        this.delkaTrvani = delkaTrvani;
        this.nazev = nazev;
    }

    public void vypisNazev() {
        System.out.println("Název: "+nazev);
    }
    public void vypisRokVydani() {
        System.out.println("Rok Vydani: "+rokVydani);
    }
    public void vypisMedio() {
        System.out.println("Medio: DVD");
    }

}
