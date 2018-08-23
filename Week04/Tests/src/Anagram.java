import java.util.Arrays;

public class Anagram {

    public static boolean twoStringsToBoolean(String str1, String str2) {

        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        return status;
    }
    public static void main(String[] args) {
        System.out.println(twoStringsToBoolean("Kee", "Peek"));
        System.out.println(twoStringsToBoolean("Mother In Law", "Hitler Woman"));
    }

}


//    a =;
//        b =;
//        if (a == b) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}


//    Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
//        Create a test for that.