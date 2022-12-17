package userinterface;

import schule.Klassenarbeit;

import java.util.Scanner;

public final class Konsole {
    public static void main(String[] args) {
        System.out.println("Notenrechner");
        System.out.println("===============");
        System.out.println("maximale Punktzahl");
        final Scanner scanner = new Scanner(System.in);
        final double punkteMaximal = scanner.nextDouble();
        System.out.println("erreichte Punktzahl");
        final double punkteErreicht = scanner.nextDouble();
        final Klassenarbeit ka = new Klassenarbeit(punkteErreicht, punkteMaximal);
        System.out.println("Anzahl Nachkommastellen");
        final int nachkommastellen = scanner.nextInt();
        System.out.print(System.lineSeparator());
        System.out.println("Note ungerundet: " + ka.berechneNote());
        System.out.println("Note gerundet: " + ka.berechneNote(nachkommastellen));
    }
}
