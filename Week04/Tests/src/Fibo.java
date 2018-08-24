public class Fibo {

    public static int fibo(int fiboIndex) {
        int j=0;
        int k=1;
        for (int i = 0; i < fiboIndex ; i++) {
            int a= j;
            j=j+k;
            k=a;

        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
}


//    Write a function that computes a member of the fibonacci sequence by a given index
//        Create tests that covers all types of input (like in the previous workshop exercise)