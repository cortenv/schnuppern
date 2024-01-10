package loesungen.aufgabe_6;

import java.util.Random;

public class aufgabe {

    public static void main(String[] args){
        //Gebe in der Konsole mithilfe einer Schleife zehn zufällige Zahlen aus!

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomZahl = random.nextInt(100);
            System.out.println(randomZahl);
        }
    }

}
