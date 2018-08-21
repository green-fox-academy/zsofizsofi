public class Numberadder {
    public static void main(String[] args) {
        int m = 5;
        numberAdder(m);
        System.out.println(factorialWithRecursion(m));

    }

    public static void numberAdder(int n) {

        if (n == 0) {
            return;
        } else {

            numberAdder(n - 1);
            System.out.println(n);
        }
    }


    public static int factorialWithRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            //System.out.println(n);
            return n * factorialWithRecursion(n - 1);
        }
    }
}


// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.