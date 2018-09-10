import java.util.ArrayList;

public class WarApp {

    public static void main(String[] args) {
        Pirates pirate1 = new Pirates("Ben");
        Pirates pirate2 = new Pirates("Frank");
        Pirates pirate3 = new Pirates("Jim");
        Pirates pirate4 = new Pirates("Beam");
        Pirates pirate5 = new Pirates("Johnnie");
        Pirates pirate6 = new Pirates("Walker");
        Pirates pirate7 = new Pirates("Morgan");
        pirate7.setStatus("Captain");

        ArrayList<Pirates> listOfPirates = new ArrayList<>();
        {
            listOfPirates.add(pirate1);
            listOfPirates.add(pirate2);
            listOfPirates.add(pirate3);
            listOfPirates.add(pirate4);
            listOfPirates.add(pirate5);
            listOfPirates.add(pirate6);
            listOfPirates.add(pirate7);

        }

        listOfPirates.get(1).drinkSomeRum();
        listOfPirates.get(2).drinkMoreRum(15);
        listOfPirates.get(1).howsItGoingMate();
        listOfPirates.get(2).howsItGoingMate();
        listOfPirates.get(2).drinkMoreRum(55);
        listOfPirates.get(1).die();
        listOfPirates.get(2).die();
        listOfPirates.get(1).brawl(listOfPirates.get(2));

        Ship ship = new Ship();
        ship.fillShip();
        System.out.println(ship.countAlivePiratesInTheShip());
        pirate7.intoxicated();

    }


}


