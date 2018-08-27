import java.util.ArrayList;
import java.util.Arrays;

public class TricyAvg {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -4, -2, 7, 3, 9, 9));
        System.out.println(getTrickyAng(list));
    }

    public static double getTrickyAng(ArrayList<Integer> numberArray) {
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.get(i) % 2 == 1) {
                odds.add(numberArray.get(i));
            } else {
                evens.add(numberArray.get(i));
            }
        }


        oddsSmallest(odds);
        evensBiggest(evens);

        return (double) (evensBiggest(evens) + oddsSmallest(odds)) / 2;
    }

    private static int evensBiggest(ArrayList<Integer> evens) {
       int actBiggest=evens.get(0);
        for (int i = 0; i < evens.size(); i++) {
            if(evens.get(i)> actBiggest) {
                actBiggest=evens.get(i);
            }
        }
        return actBiggest;

    }

    private static int oddsSmallest(ArrayList<Integer> odds) {

        int actSmallest = odds.get(0);
        for (int i = 0; i < odds.size(); i++) {
            if (odds.get(i) < actSmallest) {
                actSmallest = odds.get(i);
            }
        }
        return actSmallest;

    }
    }
