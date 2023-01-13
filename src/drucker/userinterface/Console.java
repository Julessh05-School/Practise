package drucker.userinterface;

import drucker.Drucker;
import drucker.abstractClassImplementation.CSVDokument;

public final class Console {
    public static void main(String[] args) {
        final CSVDokument dokument = new CSVDokument();
        final Drucker drucker = new Drucker();
        drucker.drucke(dokument);
        System.out.println(dokument.liesZeitpunktgedruckt());
    }

    /*public static void main(String[] args) {
        final CSVDokument dokument = new CSVDokument();
        final Drucker drucker = new Drucker();
        drucker.drucke(dokument);
        System.out.println();
    }*/
}
