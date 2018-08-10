import java.util.Scanner;

public class AddEven {

    // Adj meg egy paramétert, és a progi összeadja a számokat az annyiadik páros számig.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int userInput = scan.nextInt();
        int szám = fv(userInput);
        System.out.println(szám);
    }

    public static int fv(int a) {
        int i;
        int j;
        j = 0;
        for (i = 0; i <= a - 1; i++) {
            j =j+ 2*i;
        }
        return j;
    }
}
