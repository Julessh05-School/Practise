package sortierÜbung;

import java.util.Arrays;

public final class Console {

    public static void main(String[] args) {
        Flaeche[] flaechen = {
                new Flaeche(580, 450, "Wyoming"),
                new Flaeche(0.001, 0.002, "Tisch"),
                new Flaeche(0.068, 0.105, "Fußballfeld")
        };
        Arrays.sort(flaechen);
        for (Flaeche f : flaechen) {
            System.out.println(f.liesBreite());
            System.out.println(f.liesLange());
            System.out.println(f.liesName());
        }
    }


}
