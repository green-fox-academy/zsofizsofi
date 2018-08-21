import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        System.out.println(tiger.hunger);
        System.out.println(tiger.eat());
        System.out.println(tiger.drink());
        System.out.println(Arrays.toString(tiger.play()));
    }
}

