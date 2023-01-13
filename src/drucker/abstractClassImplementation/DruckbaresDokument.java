package drucker.abstractClassImplementation;

import java.time.LocalDateTime;

public abstract class DruckbaresDokument {

    private LocalDateTime gedrucktAm;

    public abstract String liesInhaltAlsText();

    public String liesZeitpunktgedruckt() {
        return gedrucktAm.toString();
    }

    public void gedruckt() {
        gedrucktAm = LocalDateTime.now();
    }
}
