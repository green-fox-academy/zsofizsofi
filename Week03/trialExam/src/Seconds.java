public class Seconds {
    public static void main(String[] args) {

        int[] list = new int[]{1, 2, 3, 4, 5,};
        list = second(list);
        System.out.print(list);
    }

        public static int second(int[] a) {
            int b = üres...;
            for (int i=0; i<a.length/2; i++) {
                b+=a.charAt(i * 2);
            }
            return int [] b;
        }
        // Create a function that takes a list as a parameter,
        // and returns a new list with every second element from the orignal list
        // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

}