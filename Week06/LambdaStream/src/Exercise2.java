import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Exercise2 {

    public static void main(String[] args) {
        //Write a Stream Expression to get the average value of the odd numbers from the following array:

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        OptionalDouble average = numbers.stream()
                .filter(a -> a % 2 != 0)
                .mapToInt(b->b)
                .average();

        if(average.isPresent());
        System.out.println(average);
    }
}
