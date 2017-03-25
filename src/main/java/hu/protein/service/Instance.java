package hu.protein.service;

import hu.protein.data.parse.DataParser;
import hu.protein.data.read.DataReader;
import hu.protein.data.read.FileDataReader;
import hu.protein.model.AminoAcid;
import hu.protein.view.Sources;

import java.util.List;

/**
 * Class for creating different object instances.
 * @author Peter_Fazekas on 2017.03.25..
 */
public class Instance {

    private static Instance instance = new Instance();

    private final Protein protein;
    private final Bsa bsa;
    private final DataReader file;

    private Instance() {
        file = new FileDataReader();
        DataParser aminoData = Sources.newInstance(Sources.AMINO_ACID);
        List<String> aminoLines = file.read(Sources.AMINO_ACID.getSource());
        List<String> bsaList = file.read(Sources.BSA.getSource());
        protein = new Protein((List<AminoAcid>) aminoData.parse(aminoLines));
        bsa = new Bsa(bsaList, protein);
    }

    public static Instance create() {
        return instance;
    }

    public Protein newProtein() {
        return protein;
    }

    public Bsa newBsa() {
        return bsa;
    }
}
