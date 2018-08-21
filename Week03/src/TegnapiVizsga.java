import java.util.Arrays;

public class TegnapiVizsga {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = everySecond(array);
        System.out.println(Arrays.toString(array2));
    }

    public static int[] everySecond(int[] b) {
        int j[] = new int[b.length / 2];
        for (int i = 0; i < b.length / 2; i++) {
            j[i] = b[i * 2+1];
        }
        return j;
    }
}


//        String a = "Appleaaa";
//        int c = countAs(a);
//        System.out.println(c);
//    }
//
//    public static int countAs(String b) {
//        int j = 0;
//        for (int i = 0; i < b.length(); i++) {
//            if (b.charAt(i) == 'a' || b.charAt(i)== 'A') {
//                j += 1;
//
//            }
//        }
//        return j;
//    }


//

// Create a function that takes a string parameter,
// counts the occurances of the letter "a", and returns it as a number.

// example: on the input "Apple" the function should return 1 - print this result
// example: on the input "Blueberry" the function should return 0 - print this result
