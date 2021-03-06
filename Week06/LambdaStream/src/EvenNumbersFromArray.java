import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumbersFromArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

         numbers.stream()
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);

    }
}

    //Write a Stream Expression to get the even numbers from the following array:

