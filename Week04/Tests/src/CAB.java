
import java.util.Arrays;
import java.util.Scanner;

public class CAB {

private int [] fourDigitNumber = new int [4];
private String state;

    public CAB(int[] fourDigitNumber, String state) {
        this.fourDigitNumber = fourDigitNumber;
        this.state = state;
    }

    public int[] getFourDigitNumber() {
        return fourDigitNumber;
    }

    public String getState() {
        return state;
    }

    public void guessMethod(int[] a, int[] b ){
        if (Arrays.equals(a, b)){
            System.out.println("You won" );
        }
    int [] guessedNumber;
    int counter=0;
    do {
        counter++;
    } while {
        guessedNumber != fourDigitNumber;
    }
}



    public static void main(String[] args) {

    CAB fDNum= new CAB(new int[]{1234}, "playing");
    fDNum.getFourDigitNumber();

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();




    }

}



//    Create a class what is capable of playing exactly one game of Cows and Bulls (CAB). The player have to guess a 4 digit number. For every digit that the player guessed correctly in the correct place, they have a “cow”. For every digit the player guessed correctly in the wrong place is a “bull.”
//
//        The CAB object should have a random 4 digit number, which is the goal to guess.
//        The CAB object should have a state where the game state is stored (playing, finished).
//        The CAB object should have a counter where it counts the guesses.
//        The CAB object should have a guess method, which returns a string of the guess result
//        All methods, including constructor should be tested