import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        //Write a Stream Expression to get the squared value of the positive numbers from the following array:

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        double blabla = numbers.stream()
                .filter(a -> a > 0)
                .map(b -> b*b)
                //.collect(Collectors.summingDouble(d -> d));
                .mapToDouble(c -> c)
                .sum();

        System.out.println(blabla);
    }
}
