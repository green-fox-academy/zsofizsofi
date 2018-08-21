public class SumOfD {
    public static void main(String[] args) {

    }
    public static int sumOfD(int n) {
        int m = n % 10;
        int a = n / 10;
        int b = a % 10;
        int c = a / 10;
        int d = c % 10;
        int e = c / 10;
        int f = e % 10;

        return m + b + d + f;
    }

}
