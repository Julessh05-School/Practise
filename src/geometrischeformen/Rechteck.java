package geometrischeformen;

public class Rechteck extends GeometrischeForm {
    protected final double a;

    private final double b;

    public Rechteck(double pA, double pB) {
        a = pA;
        b = pB;
    }

    @Override
    public double berechneFlaeche() {
        return a * b;
    }

    @Override
    public double berechneUmfang() {
        return 2 * a + 2 * b;
    }
}
