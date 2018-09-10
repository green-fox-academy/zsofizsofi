import java.util.ArrayList;

public class Ship {
    ArrayList<Pirates> listOfPirates = new ArrayList<>();

    public void fillShip() {
        Pirates pirateCaptain = new Pirates();
        pirateCaptain.setStatus("Captain");

        listOfPirates.add(pirateCaptain);
        int randNum = (int) (Math.random() * 10);
        for (int i = 0; i < randNum; i++) {
            Pirates pirate = new Pirates();
            listOfPirates.add(pirate);
        }
        System.out.println(randNum);

    }

    public int countAlivePiratesInTheShip() {
        int count = 0;
        for (Pirates pirate :listOfPirates) {
            if (pirate.getLifeState() == "alive") count++;
        }
        return count;
    }

    public boolean whichShipWon(Ship otherShip){
        if (this.countAlivePiratesInTheShip()> otherShip.countAlivePiratesInTheShip()){
            return true;
            }
            return false;
        }



}
