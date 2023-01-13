package drucker.abstractClassImplementation;

public final class WordDokument extends DruckbaresDokument {
    @Override
    public String liesInhaltAlsText() {
        return "Dies ist ein druckbares Word Dokument";
    }
}
