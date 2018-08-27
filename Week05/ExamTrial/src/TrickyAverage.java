import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TrickyAverage {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(130, 1, -4, 2, 7, 3, 191, 120));
        //System.out.println(getBiggest(list));
        // System.out.println((double)Collections.max(list));
        //System.out.println(getTrickyAng(list));

        System.out.println(forr(list));
    }

    private static int forr(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {

            for (int j = i; j < list.size(); j++) {
                if (list.get(i) <= list.get(j)) {
                    i = j;
                }
            }
            return list.get(i);
        }
        return 0;
    }
}
//    public static double getTrickyAng(ArrayList<Integer> numberArray) {
//        ArrayList<Integer> odds = new ArrayList<>();
//        ArrayList<Integer> evens = new ArrayList<>();
//
//        for (int i = 0; i < numberArray.size(); i++) {
//            if (numberArray.get(i) % 2 == 1) {
//                odds.add(numberArray.get(i));
//            } else {
//                evens.add(numberArray.get(i));
//            }
//            System.out.println(odds);
//            System.out.println(evens);
//        }
//        int k = 0;
//        int l = 0;
//        oddsBiggest(odds, k);
//        evensBiggest(evens, l);
//
//        return (double) (evensBiggest(odds, k) + oddsBiggest(evens, l)) / 2;
//    }
//
//    private static int evensBiggest(ArrayList<Integer> evens, int l) {
//        for (int i = 0; i < evens.size(); i++) {
//
//            for (int j = 0; j < evens.size(); j++) {
//                if (evens.get(i) < evens.get(j)) {
//                    l = evens.get(j);
//                }
//
//            }
//
//            System.out.println(l);
//        }
//        return l;
//    }
//
//    private static int oddsBiggest(ArrayList<Integer> odds, int k) {
//
//        for (int i = 0; i < odds.size(); i++) {
//
//            for (int j = 0; j < odds.size(); j++) {
//                if (odds.get(i) > odds.get(j)) {
//                    k = odds.get(i);
//
//                }
//            }
//
//        }
//        return k;
//    }
//}


//        for (Integer s: numberArray)
//        { if (numberArray.get(s)%2 == 1){
//            odds.add(numberArray.get(s));
//        } else {
//            evens.add(numberArray.get(s));
//        }
//            System.out.println(odds);
//            System.out.println(evens);
//        }
//        return 0;


//    public static double getBiggest(ArrayList<Integer> numberArray) {
//        int k;
//        int l;
//
//
//
//

//
//        //return (double)(k+l)/2;
//        return 0;


/**
 * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
 * and returns the average of the smallest odd and largest even.
 * - use only basic control flow statements, like 'for', 'if', etc.
 * - do not use built-in methods like 'filter', 'forEach', 'map', etc.
 * - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
 * <p>
 * Example cases:
 * [1, 2, 3] -> should return 1.5
 * [3, 4, 5, 6] -> should return 4.5
 * [5, 2, 8, -1] -> should return 3.5
 */
