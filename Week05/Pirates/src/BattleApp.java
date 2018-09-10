public class BattleApp {
    public static void main(String[] args) {

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        Ship ship3 = new Ship();

        ship1.fillShip();
        ship2.fillShip();
        ship3.fillShip();

        System.out.println(ship1.whichShipWon(ship2));
    }
}

