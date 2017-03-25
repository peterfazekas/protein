package hu.protein.model;

/**
 * 4. feladat: A bsa.txt a BSA nevű fehérje aminosav sorrendjét tartalmazza – egybetűs jelöléssel.
 * (A fehérjelánc legfeljebb 1000 aminosavat tartalmaz.) Határozza meg a fehérje összegképletét
 * (azaz a C, H, O, N és S számát)! A meghatározásánál vegye figyelembe, hogy az aminosavak
 * összekapcsolódása során minden kapcsolat létrejöttekor egy vízmolekula (H2O) lép ki!
 * Az összegképletet a képernyőre és az eredmeny.txt fájlba az alábbi formában írja ki:
 * Például: C 16321 H 34324 O 4234 N 8210 S 2231
 * @author Peter_Fazekas on 2017.03.25..
 */
public final class MutableAminoAcid {

    private int c;
    private int h;
    private int o;
    private int n;
    private int s;

    public MutableAminoAcid() {
        c = n = s = 0;
        h = 2;
        o = 1;
    }

    public void add(final AminoAcid aminoAcid) {
        this.c += aminoAcid.getC();
        this.h += aminoAcid.getH() - 2;
        this.o += aminoAcid.getO() - 1;
        this.n += aminoAcid.getN();
        this.s += aminoAcid.getS();
    }

    @Override
    public String toString() {
        return "C " + c + " H " + h + " O " + o + " N " + n + " S " + s;
    }
}

