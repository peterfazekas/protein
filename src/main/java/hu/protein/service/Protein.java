package hu.protein.service;

import hu.protein.model.AminoAcid;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public class Protein {

    private final List<AminoAcid> aminoAcids;

    public Protein(List<AminoAcid> aminoAcids) {
        this.aminoAcids = aminoAcids;
    }

    public String getAminoAcids() {
        StringBuilder sb = new StringBuilder();
        aminoAcids.forEach(sb::append);
        return sb.toString();
    }
}
