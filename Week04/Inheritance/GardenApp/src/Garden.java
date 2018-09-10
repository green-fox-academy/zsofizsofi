
import java.util.ArrayList;

public class Garden {


    private ArrayList<Plants> listOfAllPlants;
    // private ArrayList<Plants> listOfThirstyPlants;

    public Garden() {
        this.listOfAllPlants = new ArrayList<>();
        //this.listOfThirstyPlants = new ArrayList<>();
    }

    public ArrayList<Plants> getListOfAllPlants() {
        return listOfAllPlants;
    }

    public void addPlants(Plants plant) {
        listOfAllPlants.add(plant);
    }

    //public ArrayList<Plants> getListOfThirstyPlants() {
    //   return listOfThirstyPlants;}

    public void greeting() {
        System.out.println("Hello User! You've got a beautiful garden! Now it contains a " + listOfAllPlants.get(0).getColor() + " and a " + listOfAllPlants.get(1).getColor() + " " + listOfAllPlants.get(0).getPlantType() + " and a " +listOfAllPlants.get(2).getColor() + " and a " + listOfAllPlants.get(3).getColor() + " " + listOfAllPlants.get(2).getPlantType() + ".");

    }

    public void wateringGarden (int specifWater) {
        ArrayList <Plants> listOfThirstyPlants = new ArrayList<>();
        for (Plants plant : listOfAllPlants) {
            if ((plant.needsWater())) {
                listOfThirstyPlants.add(plant);
            }
        }
        for (Plants plants : listOfAllPlants) {
            if (plants.needsWater()) {
                plants.wateringPlants(specifWater/listOfThirstyPlants.size());
                System.out.println(listOfThirstyPlants.size());
            } else {
                //System.out.print("nyááá");
            }
        }
    }

    public void needsWater2() {
        for (int i = 0; i < listOfAllPlants.size(); i++) {
            listOfAllPlants.get(i).needsWater();
        }
    }
}
