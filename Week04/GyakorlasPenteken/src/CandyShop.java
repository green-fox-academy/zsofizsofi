
import java.util.ArrayList;

public class CandyShop {
    public static void main(String... args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));

    }

    public static ArrayList<Object> sweets(ArrayList<Object> list1) {
        //ArrayList<Object> list2 = new ArrayList<>(list1);
        list1.set(1, "Croissant");
        list1.set(3, "Ice cream");
        return list1;
    }
}


        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.


        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
