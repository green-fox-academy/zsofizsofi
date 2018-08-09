import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput1 = scan.nextInt();
        int userInput2;
        double a=0;

        for (int i = 1; i<=userInput1; i++ ) {
            System.out.println("Írj be egy számot!");
            userInput2=scan.nextInt();
            a+=userInput2;


        }
        System.out.println("Sum: " + a + " Average: " + a/userInput1);

        /*do {
            System.out.println("Írj be egy számot!");
            userInput2=scan.nextInt();}

            while (i!=userInput1); {
                i++;
                System.out.println("Sum: " + "Average: ");
        }*/






        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    }
}
