import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class Tomb {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        //System.out.println(Arrays.toString(array));

        ArrayList<Integer> tomb = new ArrayList<Integer>();


        for (int i = 0; i <10; i++) {
            tomb.add((int)(Math.random()*10));

        }
        System.out.println(tomb);
        System.out.println(tomb.size());

    }
}


