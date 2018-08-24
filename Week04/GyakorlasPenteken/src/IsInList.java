import java.util.*;

public class IsInList{
    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 15, 14, 16));
        System.out.println(checkNums(list));

    }

    public static boolean checkNums(ArrayList<Integer> list1) {
        if (list1.contains(4) && list1.contains(8) && list1.contains(12) && list1.contains(16)){
            return true;
        }else {
            return false;
        }

        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }
}