import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Szia! Milyen messze laksz a Greenfox-tól? (A válaszodat km-ben add meg!)");
        double userInput = scan.nextInt();
        userInput *=0.621;
        System.out.println("Nya, ez mérföldben ennyike:  " + userInput);

    }
}
