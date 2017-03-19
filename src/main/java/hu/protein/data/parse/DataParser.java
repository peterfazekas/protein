package hu.protein.data.parse;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public interface DataParser {

    List parser (final List<String> lines);
}
