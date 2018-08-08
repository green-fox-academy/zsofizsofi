import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput1 = scan.nextInt();
        int tipp;
        do {
            System.out.println("Szerinted melyik számra gondoltam?");
            tipp = scan.nextInt();
            if (tipp < userInput1) {
                System.out.println("The stored number is higher");
            } else if (tipp > userInput1) {
                System.out.println("The stored number is lower");
            }
        }
            while (tipp != userInput1); {
                System.out.println("You found the number: " + userInput1);
            }


    }
}
