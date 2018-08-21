public class CountAs {
    public static void main(String[] args) {
        String a = "blabla";
        a = countAs(a);
        System.out.print(a);
    }

    public static int countAs(String b) {
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            b.charAt(i);
            if (b.charAt(i) = "a" || b.charAt(i) = "A") {
                j = j++;
            } else {
                j = j;
            }

            return j;
        }
        // Create a function that takes a string parameter,
        // counts the occurances of the letter "a", and returns it as a number.

        // example: on the input "Apple" the function should return 1 - print this result
        // example: on the input "Blueberry" the function should return 0 - print this result

    }
}