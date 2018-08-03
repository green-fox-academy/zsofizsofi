import java.util.Scanner;
public class BiggerOne {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Szia! Írj be két számot!");
        double a = scan.nextInt();
        double b = scan.nextInt();
        if (a>b) {
            System.out.println(a);
        }
        if (a<b){
            System.out.println(b);
        }
        else {
            System.out.println("Hé, ugyanazt a két számot írtad be!");
        }
        }

        }

