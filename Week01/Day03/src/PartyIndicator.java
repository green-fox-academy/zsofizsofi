import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many girls are at the party?");
        int girls = scan.nextInt();
        System.out.println("How many boys are at the party?");
        int boys = scan.nextInt();
        if(girls==boys && girls+boys>=20) {
            System.out.println("The party is excellent!");
        }
        if(girls!=boys && girls+boys>=20 && girls!=0) {
            System.out.println("Quite cool party!");
        }
        if(girls+boys<20 && girls!=0) {
            System.out.println("Average party...");
        }
        if(girls==0) {
            System.out.println("Sausage party!");
        }
    }
}
