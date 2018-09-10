
public class Exercise5 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String string = "AIMS of the PROJECT  To bring together DaLaa members (old and new), international volunteers.";

        string.chars()
                .mapToObj(c -> (char) c)
                .filter(d -> Character.isUpperCase(d))
                .forEach(System.out::print);
    }
}
