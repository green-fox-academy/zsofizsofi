public class Counter {
    public static void main(String[] args) {
        int m = 12;
        System.out.println(countDown(m));
    }


    public static int countDown(int n) {
        if (n==0) {
            return 0;
        }
        else {
            System.out.println(n);
            return countDown(n-1);
        }
    }
}

 //return n * factorialWithRecursion(n - 1);
// Write a recursive function that takes one parameter: n and counts down from n