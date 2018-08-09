import java.util.Scanner;

public class GuessTheNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int userInput = scan.nextInt();
        int guess;

        do {
            System.out.println("Melyik számra gondoltam?");
            guess = scan.nextInt();
            if (guess > userInput) {
                System.out.println("Túl nagy szám.");
            } else if (guess < userInput) {
                System.out.println("Túl kicsi szám.");
            }
        }
            while (guess!=userInput);{
                System.out.println("Kitaláltad. A szám a(z) " + userInput + " volt.");
            }

    }
}

