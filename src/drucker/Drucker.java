package drucker;

import drucker.abstractClassImplementation.DruckbaresDokument;

public final class Drucker {

    public void drucke(DruckbaresDokument dokument) {
        System.out.println(dokument.liesInhaltAlsText());
    }
}
