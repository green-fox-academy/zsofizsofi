import java.util.Scanner;

public class CountingFromTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Szia! Írj be két számot!");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (b <= a) {
            System.out.println("The second number should be bigger");
        } else {
            while (a < b)
            {
                a++;

                System.out.println(a-1);
            }
        }

    }
}
