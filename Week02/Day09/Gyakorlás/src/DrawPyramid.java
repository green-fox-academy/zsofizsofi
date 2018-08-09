import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userInput= scan.nextInt();
        String stars="";
        String szünet="";
        /*for (int i=1; i<=userInput; i+=2) {
            stars += "*";
            szünet ==(userInput-i) * " ";

            System.out.println(szünet + stars + szünet);
        } Ezt majd folytatom, ha jobban megismerkedtem a tömbökkel. Az kéne, hogy a szünet változó userInput-i db szünetet vesz fel minden sor elején és végén.*/


            for(int i = 0; i < userInput; i++) {
                for(int j = 0; j < userInput - i; j++) {
                    System.out.print(" ");
                }
                for(int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }

