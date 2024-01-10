package loesungen.aufgabe_2;

import java.util.Scanner;

public class aufgabe {

    public static void main(String[] args){
        /*
        Versuche den Scanner zu importieren und einen Scanner zu erstellen.
        Versuche einen kurzen Text, also eine Zeichenkette (siehe Aufgabe 1 bei den Datentypen) einzugeben, in einer Variabel zu speichern und dann auszugeben.
        */

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }

}
