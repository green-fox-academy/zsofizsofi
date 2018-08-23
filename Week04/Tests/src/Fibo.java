public class Fibo {

    public static int fibo(int fiboIndex) {
        int j=0;
        int k=1;
        for (int i = 0; i < fiboIndex ; i++) {
            int temp= j;
            j=j+k;
            k=temp;

        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}


//    Write a function that computes a member of the fibonacci sequence by a given index
//        Create tests that covers all types of input (like in the previous workshop exercise)