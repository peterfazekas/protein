package hu.protein.data.parse;

/**
 * 6. feladat: Egy másik enzim (a Factor XI) az Arginin (R) után hasít, de csak akkor, ha Alinin (A)
 * vagy Valin (V) követi. Határozza meg, hogy a hasítás során keletkező első fehérjelánc
 * részletben hány Cisztein (C) található! A választ teljes mondatba illesztve írja ki a képernyőre!
 * @author Peter_Fazekas on 2017.03.25..
 */
public class FactorXiParser extends BsaAbstractDataParser {

    @Override
    String process(String[] items) {
        String first = items[0];
        int counter = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == 'C') counter++;
        }
        return "a hasítás során keletkező első fehérjelánc részletben " + counter + " darab Cisztein található";
    }
}
