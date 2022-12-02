package models;

public final class Klasse {
    private static int anzahlObjekte = 0;

    private String text;
    public Klasse(String text) {
        this.text = text;
        anzahlObjekte++;
    }

    public static int liesAnzahlObjekte() {
        return anzahlObjekte;
    }

    public String liesText() {
        return text;
    }
}
