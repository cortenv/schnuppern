package loesungen.aufgabe_8;

import java.util.Scanner;

public class aufgabe {

    public static void main(String[] args) {
        /*
        Programmiere einen einfachen Taschenrechner. Zuerst wird die erste Zahl gefragt, dann der Operator und dann die zweite Zahl.
        Am Schluss wird das Ergebnis ausgegeben.

        Tipp: Switch-Case ist hier praktisch

        Beispiel:

        Erste Zahl: 2

        Operator: *

        Zweite Zahl: 4

        Ergebnis: 6
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Erste Zahl: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Zweite Zahl: ");
        double zahl2 = scanner.nextDouble();

        double ergebnis = berechne(zahl1, operator, zahl2);

        System.out.println("Ergebnis: " + ergebnis);
    }

    public static double berechne(double zahl1, String operator, double zahl2) {
        double ergebnis = 0.0;

        switch (operator) {
            case "+":
                ergebnis = zahl1 + zahl2;
                break;
            case "-":
                ergebnis = zahl1 - zahl2;
                break;
            case "*":
                ergebnis = zahl1 * zahl2;
                break;
            case "/":
                ergebnis = zahl1 / zahl2;
                break;
            default:
                System.out.println("Ungültiger Operator.");
        }
        return ergebnis;
    }

}
