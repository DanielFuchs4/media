import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<IMedia> media = new ArrayList<IMedia>();


        int o = 0;
        for (int i = 0; i == 0; i++) {
            System.out.println("Vítejte!!!");
            System.out.println("Pokud chcete vytvořit nové médium stiskněte - 1");
            System.out.println("Pokud chcete smazat médium stiskněte - 2");
            System.out.println("Pokud chcete něco vypsat stiskněte - 3");

            int x = sc.nextInt();
            sc.nextLine();
                if (x < 4 || x > 0) {
                    switch (x) {
                        case 3:
                            System.out.println("Co chceš vypsat?");
                            System.out.println("");
                            System.out.println("Všechno - 1");
                            System.out.println("Specifikovaný typ - 2");
                            System.out.println("Nejstarší a nejnovější médium - 3");
                            System.out.println("Nejstarší kniha - 4");
                            System.out.println("Počet všech médií - 5");
                            System.out.println("Výpis informací o interpretech všech CD a VHS kazet - 6");
                            System.out.println("Název CD nejmladšího autora a rok narození tohoto autora - 7");
                            System.out.println("");

                            int vypsani = sc.nextInt();
                            sc.nextLine();

                            switch (vypsani) {
                                case 1:
                                    for (int p = 0;p<media.size();p++) {
                                        media.get(p).vypisNazev();
                                        media.get(p).vypisRokVydani();
                                    }
                            }

                            break;
                        case 2:
                            for (int p =0;i< media.size();p++){
                                //if ()
                            }
                            break;
                        case 1:
                            for (int u = 0; u == 0; u++) {
                                System.out.println("Jaké médium chcete vytvořit? (Kniha/ CD / DVD / VHS");
                                String noveM = sc.nextLine();
                                if (noveM.equals("Kniha")) {
                                    System.out.print("Zadej název:");
                                    String nazev = sc.nextLine();
                                    System.out.print("Zadej rok vydání:");
                                    int rok = sc.nextInt();
                                    System.out.print("Zadej počet stran:");
                                    int strany = sc.nextInt();
                                    sc.nextLine();
                                    Kniha kniha = new Kniha(nazev, rok, strany);
                                    media.add(kniha);
                                    System.out.println("Kniha uložena. :)");
                                    System.out.println("");
                                }
                                else if (noveM.equals("CD")) {
                                    System.out.print("Zadej nazev:");
                                    String nazev = sc.nextLine();
                                    System.out.print("Zadej jméno autora: ");
                                    String jmeno = sc.nextLine();
                                    System.out.print("Rok narození autora: ");
                                    int rokNarozeni = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Zadej rok vydání knihy:");
                                    int rokVydani = sc.nextInt();
                                    System.out.print("Zadej počet stran:");
                                    int strany = sc.nextInt();
                                    sc.nextLine();
                                    CD cd = new CD(nazev, jmeno, rokNarozeni, rokVydani, strany);
                                    media.add(cd);
                                    System.out.println("CD uloženo. :)");
                                    System.out.println("");

                                }
                                else if (noveM.equals("DVD")) {
                                    System.out.print("Zadej nazev:");
                                    String nazev = sc.nextLine();
                                    System.out.print("Zadej rok vydání knihy:");
                                    int rokVydani = sc.nextInt();
                                    System.out.print("Zadej délku trvání: (hodiny)");
                                    int delka = sc.nextInt();
                                    sc.nextLine();
                                    DVD dvd = new DVD(rokVydani,delka,nazev);
                                    media.add(dvd);
                                    System.out.println("DVD uloženo. :)");
                                    System.out.println("");

                                }
                                else if (noveM.equals("VHS")) {
                                    System.out.print("Zadej nazev:");
                                    String nazev = sc.nextLine();
                                    System.out.print("Zadej jméno autora: ");
                                    String jmeno = sc.nextLine();
                                    System.out.print("Rok narození autora: ");
                                    int rokNarozeni = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Zadej rok vydání knihy:");
                                    int rokVydani = sc.nextInt();
                                    System.out.print("Zadej počet skladeb:");
                                    int pocetSkladeb = sc.nextInt();
                                    sc.nextLine();
                                    VHSKazeta vhs = new VHSKazeta(nazev, jmeno, rokNarozeni, rokVydani, pocetSkladeb);
                                    media.add(vhs);
                                    System.out.println("VHS kazeta uložena. :)");
                                    System.out.println("");
                                }
                                else {
                                    System.out.println("Zadal jsi špatné médium.Napiš ho znovu.");
                                    u--;
                                }
                            }
                            break;
                    }
                }
                     else{
                            System.out.println("Bohužel jsi zadal špatne číslo");
                        }
                     i--;
            }
        }

    }