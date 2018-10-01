public class Prím {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }

    public static boolean isPrime(int a) {
        if (a==1 || a==0) {return false;}
        if(a==2) {return true;}
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

