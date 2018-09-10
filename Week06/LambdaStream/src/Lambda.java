import java.awt.*;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        IntSupplier rand = () -> 4;
        IntPredicate isPositive = number -> number > 0;
        Predicate<Integer> isPositive2 = number -> number > 0;
        Runnable valami = () -> System.out.println("valami");
        valami.run();

    }
}
