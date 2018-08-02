import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Szia! Hogy hívnak?");
        String userInput1 = scan.nextLine();

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Szia " + userInput1 + "! Hány éves vagy?");
        int userInput2 = scan.nextInt();
        System.out.println("Köszönöm! Tehát " + userInput2 + " éves vagy.");
    }
}
