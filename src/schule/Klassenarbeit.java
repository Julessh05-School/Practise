package schule;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class Klassenarbeit {
    private final double punkteErreicht;

    private final double punkteMaximal;

    public Klassenarbeit(double punkteErreicht, double punkteMaximal) {
        this.punkteErreicht = punkteErreicht;
        this.punkteMaximal = punkteMaximal;
    }

    public double berechneNote() {
        return 6 - 5 * (punkteErreicht / punkteMaximal);
    }

    public double berechneNote(int nachkommastellen) {
        if(nachkommastellen == 0) {
            return Math.round(berechneNote());
        } else {
            final BigDecimal decimal = BigDecimal.valueOf(berechneNote());
            return decimal.setScale(nachkommastellen, RoundingMode.FLOOR).doubleValue();
        }
    }
}
