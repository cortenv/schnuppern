package loesungen.aufgabe_7;

import java.util.Random;
import java.util.Scanner;

public class aufgabe {

    public static void main(String[] args) {
        //Erstelle ein Zahlen rate Spiel.
        //Der Spieler soll eine Zahl zwischen 1 und 100 eingeben.
        //Wenn die Zahl höher als die zufällig generierte Zahl ist, so gebe "zu hoch" ein.
        //Ist sie hingegen tiefer als die zufällige Zahl, so gebe "zu tief" ein.
        //Wenn der Spieler die richtige Zahl erraten hat, schreibe "Gratulation, du hast es Geschafft!" in die Konsole.
        //Wenn der Spieler mehr als 5 Versuche ohne korrektes Raten hatte, so gebe in der Konsole "Niederlage" aus und beende das Spiel.

        System.out.println("Es wurde eine Zahl zwischen 1 bis 100 generiert. Versuceh sie zu erraten. Du hast 5 versuche");
        Random random1 = new Random();
        int randomZahl = random1.nextInt(100);
        System.out.println(randomZahl);

        for (int i = 0; i < 5; i++) {
            Scanner input1 = new Scanner(System.in);
            int userValue = input1.nextInt();

            if (userValue > randomZahl) {
                System.out.println("Die Zahl die gesucht wird ist kleiner!");
            }

            if (userValue < randomZahl) {
                System.out.println("Die Zahl die gesucht wird ist grösser!");
            }

            if (userValue < 1) {
                System.out.println("Bitte wählen Sie eine Zahl zwischen 1-100");
            }

            if (userValue > 100) {
                System.out.println("Bitte wählen Sie eine Zahl zwischen 1-100");
            }

            if (userValue == randomZahl) {
                System.out.println("Du hast die richtige Zahl erraten!");
                System.exit(0);
            }
            int versuche = 4 - i;
            System.out.println("Anzahl Versuche übrig: " + versuche);
        }
    }

}
