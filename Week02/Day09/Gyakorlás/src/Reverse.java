import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int aj[]= {3,4,5,6,7};
        int temp = aj[0];
        aj[0] = aj[aj.length-1];
        aj[aj.length-1] = temp;
        int temp2 = aj[1];
        aj[1] = aj[aj.length-2];
        aj[aj.length-2] = temp2;
        System.out.print(Arrays.toString(aj));
    }
}


// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`