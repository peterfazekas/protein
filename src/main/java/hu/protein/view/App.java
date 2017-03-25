package hu.protein.view;

import hu.protein.data.log.DataLogger;
import hu.protein.data.log.FileDataLogger;
import hu.protein.service.Bsa;
import hu.protein.service.Instance;
import hu.protein.service.Protein;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public class App {

    private final Protein protein;
    private final Bsa bsa;
    private final Instance instance;
    private final DataLogger log;

    public static void main(String[] args) {
        App app = new App();
        app.println();
    }

    public App() {
        instance = Instance.create();
        protein = instance.newProtein();
        bsa = instance.newBsa();
        log = new FileDataLogger("eredmeny.txt");
    }

    private void println() {
        log.println("3. feladat: " + protein.getAminoAcids());
        log.println("4. feladat: " + bsa.molecularFormula());
        log.println("5. feladat: " + bsa.parser(Sources.CHYMOTRYPSIN_PATTERN));
        log.println("6. feladat: " + bsa.parser(Sources.FACTOR_XI_PATTERN));
    }
}
