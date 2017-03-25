package hu.protein.service;

import hu.protein.data.parse.BsaAbstractDataParser;
import hu.protein.data.parse.DataParser;
import hu.protein.model.AminoAcid;
import hu.protein.model.MutableAminoAcid;
import hu.protein.view.Sources;

import java.util.List;
import java.util.Map;

/**
 * @author Peter_Fazekas on 2017.03.25..
 */
public class Bsa {

    private final List<String> bsa;
    private final Protein protein;
    private DataParser dataParser;

    public Bsa(final List<String> bsa, final Protein protein) {
        this.bsa = bsa;
        this.protein = protein;
    }

    /**
     * 4. feladat: A bsa.txt a BSA nevű fehérje aminosav sorrendjét tartalmazza – egybetűs jelöléssel.
     * (A fehérjelánc legfeljebb 1000 aminosavat tartalmaz.) Határozza meg a fehérje összegképletét
     * (azaz a C, H, O, N és S számát)! A meghatározásánál vegye figyelembe, hogy az aminosavak
     * összekapcsolódása során minden kapcsolat létrejöttekor egy vízmolekula (H2O) lép ki!
     * Az összegképletet a képernyőre és az eredmeny.txt fájlba az alábbi formában írja ki:
     * Például: C 16321 H 34324 O 4234 N 8210 S 2231
     */
    public String molecularFormula() {
        Map<String, AminoAcid> proteinMap = protein.convertToMap();
        MutableAminoAcid sum = new MutableAminoAcid();
        bsa.forEach(i -> sum.add(proteinMap.get(i)));
        return sum.toString();
    }

    public String parser(String pattern) {
        dataParser = Sources.newInstance(Sources.BSA, pattern);
        return (String) dataParser.parse(bsa, pattern);
    }
}
