import java.util.Scanner;

public class DrawTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number!");
        int num = scanner.nextInt();

        String star = "";
        for (int i = 1; i <= num; i++) {

            star += "*";
            System.out.println(star);
        }

    }
}


// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was