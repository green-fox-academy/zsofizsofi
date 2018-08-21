public class SumDigit {
    public static void main(String[] args) {
        int m = 12345;
        int a = 0;
        System.out.println(sumOfDigits(m, a));

    }

    public static int sumOfDigits(int n, int a) {

        if (n == 0) {
            return a;
        } else {
            a += n % 10;
            n = n / 10;
            return sumOfDigits(n, a);
        }
    }

}

//    public static int sumOfD(int n) {
//        int m = n % 10;
//        int a = n / 10;
//        int b = a % 10;
//        int c = a / 10;
//        int d = c % 10;
//        int e = c / 10;
//        int f = e % 10;
//
//        return m + b + d + f;
//    }
//}

//System.out.println(sumOfNumbers(m));
//
//int a = 0;
//System.out.println(sumDigDo2(m));
//System.out.println(sumOfDigits(m, a));
//System.out.println(sumD3(m, a));

//   }

//    public static int sumDigDo2(int n) {
//
//        int a = 0;
//        do {
//            a += n % 10;
//            n = n / 10;
//        }
//        while (n != 0);
//        return a;
//    }


//

//    public static int sumD3(int n) {
//        if (n==0) {
//            return 0; }
//
//                else{
//                    return n%10 + sumD3(n/10);
//
//                }
//            }
//
//    }


//public static int sumOfNumbers(int n) {
//        if (n == 0) {
//            return 0;
//        } else {
//            return n + sumOfNumbers(n - 1);
//        }
//    }


//// Given a non-negative int n, return the sum of its digits recursively (no loops).
//// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12)./