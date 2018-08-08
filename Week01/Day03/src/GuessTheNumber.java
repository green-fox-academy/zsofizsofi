import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        int a= 12;
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        int i;
        do {
        System.out.println("Szerinted melyik számra gondoltam?");
        while ()

        }
        /*for (int i=userInput1;*/
        if (a>userInput){
            System.out.println("The stored number is higher");
            System.out.println("Tippelj megint!");
            int userInput2=scan.nextInt();

        }
        else if (a<userInput1) {
            System.out.println("The stored number is lower");
        }
        else {
            System.out.println("You found the number: " + a);
        }
    }

}
