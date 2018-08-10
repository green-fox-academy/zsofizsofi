import java.util.Scanner;

public class NumEven {

    // Adj meg egy paramétert, és a progi kiírja az annyiadik páros számot.

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
            j += 2;
        }
        return j;
    }
}

