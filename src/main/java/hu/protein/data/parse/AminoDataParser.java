package hu.protein.data.parse;

import hu.protein.model.AminoAcid;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public class AminoDataParser implements DataParser {

    public static final int ITEM_COUNT = 7;

    @Override
    public List<AminoAcid> parser(final List<String> lines) {
        List<AminoAcid> aminoAcids = new ArrayList<>();
        for (int i = 0; i < lines.size(); i+= ITEM_COUNT) {
            aminoAcids.add(createAminoAcid(lines, i));
        }
        return aminoAcids;
    }

    private AminoAcid createAminoAcid(final List<String> lines, int start) {
        String name = lines.get(start);
        String key = lines.get(start + 1);
        int c = Integer.parseInt(lines.get(start + 2));
        int h = Integer.parseInt(lines.get(start + 3));
        int o = Integer.parseInt(lines.get(start + 4));
        int n = Integer.parseInt(lines.get(start + 5));
        int s = Integer.parseInt(lines.get(start + 6));
        return new AminoAcid(name, key, c, h, o, n, s);
    }

}
