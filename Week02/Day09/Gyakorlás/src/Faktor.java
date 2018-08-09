import java.util.Scanner;

public class Faktor {
    // Kérj be egy számot, és add vissza a faktoriálisát!

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int userInput=scan.nextInt();
        int i;
        int fakt;
        fakt=1;
        for (i=1; i<=userInput; i++ ) {
            fakt=fakt*i;
        }
        System.out.println(fakt);


    }
}
