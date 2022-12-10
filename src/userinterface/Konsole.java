package userinterface;

import geometrischeformen.GeometrischeForm;
import geometrischeformen.Kreis;
import geometrischeformen.Quadrat;
import geometrischeformen.Rechteck;

public final class Konsole {
    public static void main(String[] args) {
        final GeometrischeForm[] a = new GeometrischeForm[3];
        a[0] = new Kreis(10);
        a[1] = new Rechteck(5, 4.5);
        a[2] = new Quadrat(6.45);
        for(GeometrischeForm f : a) {
            System.out.println(f.berechneFlaeche() + f.berechneUmfang());
        }
    }
}
