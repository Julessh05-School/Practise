package drucker;

import drucker.abstractClassImplementation.DruckbaresDokument;

import javax.swing.*;
import java.awt.print.PrinterException;

public final class Drucker {

    public void drucke(DruckbaresDokument dokument) {
        final JTextArea textArea = new JTextArea(dokument.liesInhaltAlsText());
        try {
            textArea.print();
        } catch (PrinterException ignored) {
        }
        // dokument.gedruckt();
    }
}
