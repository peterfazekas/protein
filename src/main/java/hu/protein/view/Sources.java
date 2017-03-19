package hu.protein.view;

import hu.protein.data.parse.AminoDataParser;
import hu.protein.data.parse.BsaDataParser;
import hu.protein.data.parse.DataParser;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public enum Sources {

    AMINOACID("aminosav.txt", AminoDataParser.class),
    BSA("bsa.txt", BsaDataParser.class);

    private final String source;
    private final Class parserType;

    Sources(final String source, final Class parserType) {
        this.source = source;
        this.parserType = parserType;
    }

    public Class getParserType() {
        return parserType;
    }

    public String getSource() {
        return source;
    }
}
