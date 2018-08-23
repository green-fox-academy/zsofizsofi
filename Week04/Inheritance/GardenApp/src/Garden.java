import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.util.ArrayList;

public class Garden {


    private ArrayList<Plants> listOfAllPlants;
    private ArrayList<Plants> listOfThirstyPlants;

    public Garden() {
        this.listOfAllPlants = new ArrayList<>();
        this.listOfThirstyPlants = new ArrayList<>();
    }

    public ArrayList<Plants> getListOfAllPlants() {
        return listOfAllPlants;
    }

    public ArrayList<Plants> getListOfThirstyPlants() {
        return listOfThirstyPlants;
    }

    public void greeting() {
        System.out.println("Hello User! You've got a beautiful garden! Now it contains 'methoddal beírni később' a yellow and a blue flower, and a purple and an orange tree.");

    }

    public void watering40 () {

    }


    public void needsWater2() {
        for (int i = 0; i < listOfAllPlants.size(); i++) {
            listOfAllPlants.get(i).needsWater();
        }
    }
}
