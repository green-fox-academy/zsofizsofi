import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Szia! Írj be egy számot!");
        int a = scan.nextInt();
        int i=0;
        while (i<10){
            i++;
            System.out.println(i + " * " + a +" = " + i*a);
        }
    }
}
