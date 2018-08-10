public class Summing2 {

        public static void main(String[] args) {
        int num = sum(12);
            System.out.println(num);

        }
        public static int sum(int a) {

            int j;
            j=0;
            for (int i=0; i<=a; i++) {
                j=j+i;
            }
            return j;

        }


}


   // Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer