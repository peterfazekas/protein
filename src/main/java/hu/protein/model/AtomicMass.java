package hu.protein.model;

/**
 * AtomicMass class - relatív molelkulatömeg megállapítása.
 * 2. feladat: Határozza meg az aminosavak relatív molekulatömegét, ha a szén atomtömege 12,
 * a hidrogéné 1, az oxigéné 16, a nitrogéné 14 és a kén atomtömege 32!
 * Például a Glicin esetén a relatív molekulatömeg 2·12 + 5·1 + 2·16 + 1·14 + 0·32 = 75.
 * @author Peter_Fazekas on 2017.03.19..
 */
public enum AtomicMass {
    C(12), H(1), O(16), N(14), S(32);

    private final int mass;

    AtomicMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public static int calculateAtomicMass(final int[] nuclearPieces) {
        int atomicMass = 0, index = 0;
        for(AtomicMass thisMass : AtomicMass.values()) {
            atomicMass += thisMass.getMass() * nuclearPieces[index++];
        }
        return atomicMass;
    }
}
