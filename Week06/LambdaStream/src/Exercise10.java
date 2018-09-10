import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the foxes with green color!
        //Write a Stream Expression to find the foxes with green color and pallida type!

        Fox fox1 = new Fox("Julcsi", "Pallida", "green");
        Fox fox2 = new Fox("Rózsika", "Pallida", "purple");
        Fox fox3 = new Fox("János", "Vulpes", "red");
        Fox fox4 = new Fox("József", "Velox", "blue");
        Fox fox5 = new Fox("Márta", "Ferrilata", "green");

        List<Fox> foxList = new ArrayList<>();
        foxList.add(fox1);
        foxList.add(fox2);
        foxList.add(fox3);
        foxList.add(fox4);
        foxList.add(fox5);

        String color = "green";
        String type = "Pallida";

       foxList.stream()
                .filter(a -> a.getColor().equals(color) || a.getType().equals(type))
                .forEach(b -> System.out.println(b.getName()));

        List<Fox> newList = foxList.stream()
                .filter(a -> a.getColor().equals(color) || a.getType().equals(type))
                .collect(Collectors.toList());

        for (Fox s : newList) {
            System.out.println(s.getName());

        }
    }
}
