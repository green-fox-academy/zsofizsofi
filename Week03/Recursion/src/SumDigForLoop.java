public class SumDigForLoop {
    public static void main(String[] args) {
        int m = 1234578;
        System.out.println(sumDigDo2(m));
    }

    public static int sumDigDo2(int n) {
        int a = 0;
        do {
            a += n % 10;
            n = n / 10;
        }
        while (n != 0);
        return a;
    }

}


//    public static int sumOfDig(int n) {
//        int a = 0;
//        for (int i = 0; i < 7; i++) {
//            a += n % 10;
//            n = n / 10;
//        }
//        return a;
//    }
//}

//        System.out.println(sumOfDig(n));
//        System.out.println(sumDigDo(n));
//        System.out.println(sumDigDo2(n));

//    public static int sumDigDo(int n) {
//        int j;
//        int k;
//        int a=0;
//
//        do {
//            j = n % 10;
//            k = n / 10;
//            a += j;
//            n = k;}
//        while (k!=0);
//        return a;
//    }
//

//
//
//    public static int sumOfDig(int n) {
//        int a = 0;
//        for (int i = 0; i < 7; i++) {
//            a +=  n % 10;
//            n = n / 10;
//        }
//        return a;
//    }
//
//
//
//
//}
