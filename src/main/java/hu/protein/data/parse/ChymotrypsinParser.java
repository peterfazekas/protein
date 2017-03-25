package hu.protein.data.parse;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 5. feladat: A fehérjék szekvencia szerkezetét hasításos eljárással határozzák meg.
 * Egyes enzimek bizonyos aminosavak után kettéhasítják a fehérjemolekulát.
 * Például a Kimotripszin enzim a Tirozin (Y), Fenilalanin (W) és a Triptofán (F) után hasít.
 * Határozza meg, és írja ki képernyőre a Kimotripszin enzimmel széthasított BSA lánc leghosszabb
 * darabjának hosszát és az eredeti láncban elfoglalt helyét (első és utolsó aminosavának sorszámát)!
 * A kiíráskor nevezze meg a kiírt adatot, például: „kezdet helye:”!
 * @author Peter_Fazekas on 2017.03.25..
 */
public class ChymotrypsinParser extends BsaAbstractDataParser{

    @Override
    String process(final String[] items) {
        String longest = Arrays.asList(items).stream().max(Comparator.comparing(String::length)).get();
        int begin = findBegin(items, longest);
        int length = longest.length();
        return "kezdet: " + begin + ", vég: " + (begin + length - 1) + ", hossza: " + length;
    }

    private int findBegin(final String[] items, final String longest) {
        int index = 0, begin = 0;
        while(items[index] != longest) {
            begin += items[index].length();
            index++;
        }
        return begin;
    }


}
