import java.util.Scanner;
public class AnimalAndLegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Szia Farmer! Hány csirkéd van?");
        int userInput1 = scan.nextInt();
        System.out.println("És hány malacod?");
        int userInput2 = scan.nextInt();
        int a = userInput1*2+userInput2*4;
        System.out.println("Az állataidnak ennyi lába van összesen: " + a);



        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
