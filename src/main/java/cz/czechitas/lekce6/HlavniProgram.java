package cz.czechitas.lekce6;

import cz.czechitas.lekce6.kontakty.Osoba;
import cz.czechitas.lekce6.nakupniseznam.NakupniSeznam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hlaví třída pro lekci 6.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        new NakupniSeznam().run();
        new Osoba("Honza", "Nebojsa").run();

    }

}
