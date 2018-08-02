public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int a = 23-currentHours;
        int b = 59-currentMinutes;
        int c = 60-currentSeconds;
        System.out.println("LeftHours: " + a);
        System.out.println("LeftMinutes: " + b);
        System.out.println("LeftSeconds: " + c);
/* ide még kéne egy if/else arra az esetre, ha a currentSec=0. */
    }
}