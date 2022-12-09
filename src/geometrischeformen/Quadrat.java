package geometrischeformen;

public final class Quadrat extends Rechteck {
    public Quadrat(double pA) {
        super(pA, pA);
    }

    @Override
    public double berechneFlaeche() {
        return Math.pow(a, 2);
    }

    @Override
    public double berechneUmfang() {
        return 4 * a;
    }
}
