public class DivideByZero {
    public static void main(String[] args) {
        int number;
        number = 0;
        int result2 = divideByZero(number);
        System.out.println(result2);
    }

    public static int divideByZero(int divisor) {
        int result = 0;

        try { // Prevents the program breaking when attempting dividing by zero
            result = 10 / divisor;

            // int result = 12 / divisor; // If the input value for divisor was 0 it stops the try block
            // System.out.println(result); // The program doesn't reach this line if the input was 0
        } catch (ArithmeticException e) {
            System.out.println("Fail"); // This line only runs if the input was 0
        }
        return result;
    }
}


// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0.