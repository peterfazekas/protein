package hu.protein.model;

/**
 * @author Peter_Fazekas on 2017.03.19..
 */
public class AminoAcid {

    private final String name;
    private final String key;
    private final int c;
    private final int h;
    private final int o;
    private final int n;
    private final int s;
    private final int atomicMass;

    public AminoAcid(final String name, final String key, final int c, final int h, final int o, final int n, final int s) {
        this.name = name;
        this.key = key;
        this.c = c;
        this.h = h;
        this.o = o;
        this.n = n;
        this.s = s;
        atomicMass = calculateAtomicMass();
    }

    private int calculateAtomicMass() {
        int[] nuclearPieces = {c, h, o, n, s} ;
        return AtomicMass.calculateAtomicMass(nuclearPieces);
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public int getC() {
        return c;
    }

    public int getH() {
        return h;
    }

    public int getO() {
        return o;
    }

    public int getN() {
        return n;
    }

    public int getS() {
        return s;
    }

    public static AminoAcid add(final AminoAcid a1, final AminoAcid a2) {
        int c = a1.c + a2.c;
        int h = a1.h + a2.h;
        int o = a1.o + a2.o;
        int n = a1.n + a2.n;
        int s = a1.s + a2.s;
        return new AminoAcid(null, null, c, h, n, o, s);
    }

    @Override
    public String toString() {
        return "\r\n   " + name + " " + atomicMass;
    }
}
