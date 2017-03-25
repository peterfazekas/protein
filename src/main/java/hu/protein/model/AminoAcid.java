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

    public int getAtomicMass() {
        return atomicMass;
    }


    @Override
    public String toString() {
        return "\r\n   " + name + " " + atomicMass;
    }
}
