import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Írj be öt egész számot egy sorba!");
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        double d = scan.nextInt();
        double e = scan.nextInt();
        double f = a + b + c + d + e;
        double g = (a + b + c + d + e)/5;

        System.out.println("Sum: " + f + ", Average: " + g);


    }

}
