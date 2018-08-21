//public class Power {
//    public static void main(String[] args) {
//        int base = 3;
//        int n = 3;
//        int j = 1;
//        System.out.println(powerN(base, n));
//        System.out.println(powerNRec(base, n, j));
//    }
//
//    public static int powerN(int a, int b) {
//        if (b == 0) {
//            return 1;
//        } else {
//            int j = 1;
//
//            for (int i = 1; i <= b; i++) {
//                j = j * a;
//            }
//            return j;
//        }
//    }
//}


//    public static int powerNRec(int a, int b, int j) {
//        if(b==0){
//            return 1;
//        } else {
//            j = j * a;
//            return a*powerNRec(a);
//        }
//    }
//}

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
