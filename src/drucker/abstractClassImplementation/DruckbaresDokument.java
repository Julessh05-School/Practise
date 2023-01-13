package drucker.abstractClassImplementation;

public abstract class DruckbaresDokument {

    public abstract String liesInhaltAlsText();

    public String liesZeitpunktgedruckt() {
        return String.valueOf(System.currentTimeMillis());
    }
}
