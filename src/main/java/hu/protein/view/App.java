package hu.protein.view;

import hu.protein.data.parse.DataParser;
import hu.protein.data.read.DataReader;
import hu.protein.data.read.FileDataReader;
import hu.protein.service.Protein;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public class App {

    private final Protein protein;
    private final DataReader file;

    public static void main(String[] args) {
        App app = new App();
        app.println();
    }

    public App() {
        file = new FileDataReader();
        DataParser aminoData = null;
        try {
            aminoData = (DataParser) Sources.AMINOACID.getParserType().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //        DataParser bsaData = Sources.BSA.getParserType().cast(DataParser.class);
        List<String> aminoLines = file.read(Sources.AMINOACID.getSource());
        protein = new Protein(aminoData.parser(aminoLines));
    }

    private void println() {
        System.out.println("3. feladat: " + protein.getAminoAcids());
    }
}
