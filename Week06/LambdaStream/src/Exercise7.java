public class Exercise7 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the frequency of characters in a given string!

        String string = "AIMS of the PROJECT  To bring together DaLaa members (old and new), international volunteers.";

        char letter = 'v';

        long numbersOfLetter= string.chars()
                .mapToObj(c -> (char) c)
                .filter(d-> d.equals(letter))
                .count();

        System.out.println(numbersOfLetter);
    }
}
