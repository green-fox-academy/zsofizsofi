
import java.util.*;
import java.util.ArrayList;

public class ArrayListAppendA {
    public static void main(String... args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("bo", "anacond", "koal", "pand", "zebr"));
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }


        public static ArrayList appendA (ArrayList < String > list) {
            ArrayList<String> newList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                newList.add(list.get(i) + "a");

            }
            return newList;

        }



}