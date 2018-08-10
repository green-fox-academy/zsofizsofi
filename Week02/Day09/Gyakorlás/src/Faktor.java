import java.util.Scanner;

public class Faktor {
    // Kérj be egy számot, és add vissza a faktoriálisát!

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int userInput = scan.nextInt();
        int eredmeny = faktor(userInput);
        System.out.println(eredmeny);
    }

    public static int faktor(int a) {
        int i;
        int fakt;
        fakt = 1;
        for (i = 1; i <= a; i++) {
            fakt = fakt * i;
        }
        return fakt;


    }


}
