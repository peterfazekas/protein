package hu.protein.view;

import hu.protein.data.parse.*;

import java.util.*;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public enum Sources {

    AMINO_ACID("aminosav.txt", AminoDataParser.class),
    BSA("bsa.txt", BsaAbstractDataParser.class);

    public static final String CHYMOTRYPSIN_PATTERN = "[YWF]";
    public static final String FACTOR_XI_PATTERN = "R[AV]";

    private static final Map<String, Class<? extends BsaAbstractDataParser>> bsaMap = new HashMap<String, Class<? extends BsaAbstractDataParser>>() {{
        put(CHYMOTRYPSIN_PATTERN, ChymotrypsinParser.class);
        put(FACTOR_XI_PATTERN, FactorXiParser.class);
    }};

    private final String source;
    private final Class parserType;

    Sources(final String source, final Class parserType) {
        this.source = source;
        this.parserType = parserType;
    }

    public String getSource() {
        return source;
    }

    public static DataParser newInstance(final Sources sources, final String... pattern) {
        DataParser instance = null;
        try {
            instance = (null != pattern && pattern.length > 0) ? bsaMap.get(pattern[0]).newInstance() : (DataParser) sources.getParserType().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }

    private Class getParserType() {
        return parserType;
    }

}
