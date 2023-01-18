package sortierÜbung;

public final class Flaeche implements Comparable<Flaeche> {

    private final double breite;

    private final double lange;

    private final String name;


    public Flaeche(double breite, double lange, String name) {
        this.breite = breite;
        this.lange = lange;
        this.name = name;
    }

    public double liesBreite() {
        return breite;
    }

    public double liesLange() {
        return lange;
    }

    public String liesName() {
        return name;
    }

    @Override
    public int compareTo(Flaeche o) {
        return (int) ((breite * lange) - (o.breite * o.lange));
    }
}
