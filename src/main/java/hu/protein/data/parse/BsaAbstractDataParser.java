package hu.protein.data.parse;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public abstract class BsaAbstractDataParser implements DataParser {

    private String bsa;
    private String pattern;
    private final StringBuilder sb = new StringBuilder();

    @Override
    public Object parse(final List<String> lines, final String... pattern) {
        this.pattern = pattern.length > 0 ? pattern[0] : null ;
        lines.forEach(sb::append);
        bsa = sb.toString();
        return process(split());
    }

    private String[] split() {
        return bsa.split(pattern);
    }

    abstract String process(String[] items);
}
