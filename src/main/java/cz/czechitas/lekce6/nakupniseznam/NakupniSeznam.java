package cz.czechitas.lekce6.nakupniseznam;

import java.util.ArrayList;
import java.util.List;

public class NakupniSeznam {
    private final List<Polozka> seznam = new ArrayList<>();

    public void run() {
        naplnSeznam();
        System.out.printf("Na začátku seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);

        Polozka tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Třetí položka je: %s", tretiPolozka).println();

        smazDruhouPolozku();
        tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Nová třetí položka je: %s", tretiPolozka).println();

        pridejDalsiPolozku();
        System.out.printf("Na konci seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);
    }

    /**
     * Naplní seznam alespoň 4 položkami.
     */
    private void naplnSeznam() {
        seznam.add(new Polozka("jablka", 3, "kg"));
        seznam.add(new Polozka("paprika", 1, "kg"));
        seznam.add(new Polozka("mleko", 1, "l"));
        seznam.add(new Polozka("babovka", 1, "ks"));
    }

    /**
     * Vrátí třetí položku ze seznamu.
     *
     * @return
     */
    private Polozka ziskejTretiPolozku() {
        return seznam.get(2);
    }

    /**
     * Smaže druhou položku ze seznamu.
     */
    private void smazDruhouPolozku() {
        seznam.remove(1);
    }

    /**
     * Přidá novou položku na konec seznamu.
     */
    private void pridejDalsiPolozku() {
        seznam.add(new Polozka("chleba", 1, "ks"));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nákupní seznam");
        builder.append("\n");
        for (Polozka polozka : seznam) {
            builder.append("* ");
            builder.append(polozka);
            builder.append("\n");
        }
        return builder.toString();
    }
}
