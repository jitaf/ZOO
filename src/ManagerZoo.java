import java.util.ArrayList;

public class ManagerZoo {

    private ArrayList<Zvire> zvirata = new ArrayList<>();

    public void pridejZvire(Zvire zvire) {
        zvirata.add(zvire);
    }

    public void odeberZvire(String jmeno) {
        for (int i = 0; i < zvirata.size(); i++) {
            if (zvirata.get(i).getJmeno().equals(jmeno)) {
                zvirata.remove(i);
                System.out.println("Zvire bylo odebrano.");
                return;
            }
        }

        System.out.println("Zvire nebylo nalezeno.");
    }

    public void vypisZvirata() {
        for (Zvire zvire : zvirata) {
            zvire.vypisJmenoADatum();
            zvire.vydejZvuk();
            System.out.println();
        }
    }

    public void vypisNejstarsi() {
        if (zvirata.size() == 0) {
            System.out.println("V zoo nejsou zadna zvirata.");
            return;
        }

        Zvire nejstarsi = zvirata.get(0);

        for (Zvire zvire : zvirata) {
            if (zvire.getRokNarozeni() < nejstarsi.getRokNarozeni()) {
                nejstarsi = zvire;
            }
        }

        System.out.println("Nejstarsi zvire:");
        nejstarsi.vypisJmenoADatum();
    }

    public void vypisNejmladsi() {

        if (zvirata.size() == 0) {
            System.out.println("V zoo nejsou zadna zvirata.");
            return;
        }

        Zvire nejmladsi = zvirata.get(0);

        for (Zvire zvire : zvirata) {
            if (zvire.getRokNarozeni() > nejmladsi.getRokNarozeni()) {
                nejmladsi = zvire;
            }
        }

        System.out.println("Nejmladsi zvire:");
        nejmladsi.vypisJmenoADatum();
    }
}
