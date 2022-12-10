package geometrischeformen;

public final class Kreis extends GeometrischeForm {

    private final double r;

    public Kreis(double pR) {
        r = pR;
    }

    @Override
    public double berechneFlaeche() {
       return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * r;
    }
}
