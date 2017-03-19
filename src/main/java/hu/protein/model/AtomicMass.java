package hu.protein.model;

/**
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
