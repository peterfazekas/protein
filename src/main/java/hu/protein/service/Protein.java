package hu.protein.service;

import hu.protein.model.AminoAcid;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public class Protein {

    private final List<AminoAcid> aminoAcids;

    /**
     * Constructor.
     * 3. feladat: Rendezze növekvő sorrendbe az aminosavakat a relatív molekulatömeg szerint!
     * Írja ki a képernyőre és az eredmeny.txt fájlba az aminosavak hárombetűs azonosítóját és
     * a molekulatömeget! Az azonosítót és hozzátartozó molekulatömeget egy sorba,
     * szóközzel elválasztva írja ki!
     * @param aminoAcids - a beolvasott rendezetlen lista.
     */
    public Protein(final List<AminoAcid> aminoAcids) {
        this.aminoAcids = aminoAcids.stream()
                .sorted(Comparator.comparing(AminoAcid::getAtomicMass))
                .collect(Collectors.toList());
    }

    public String getAminoAcids() {
        StringBuilder sb = new StringBuilder();
        aminoAcids.forEach(sb::append);
        return sb.toString();
    }

    public Map<String, AminoAcid> convertToMap() {
        Map<String, AminoAcid> proteinMap = new TreeMap<>();
        aminoAcids.forEach(i -> proteinMap.put(i.getKey(), i));
        return proteinMap;
    }

}
