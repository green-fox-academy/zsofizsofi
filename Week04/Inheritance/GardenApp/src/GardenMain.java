import java.util.ArrayList;
import java.util.Arrays;

public class GardenMain {
    public static void main(String[] args) {
        //ArrayList<Plants> plants = new ArrayList<>();

        Garden garden = new Garden();
        Plants flower1 = new Flowers("yellow");
        Flowers flower2 = new Flowers("blue");
        Trees tree1 = new Trees("purple");
        Trees tree2 = new Trees("orange");

        garden.addPlants(flower1);
        garden.addPlants(flower2);
        garden.addPlants(tree1);
        garden.addPlants(tree2);

        garden.greeting();

        //plants.needsWater(); értelmetlen!!!!
//        flower1.needsWater();
//        flower2.needsWater();
//        tree1.needsWater();
//        tree2.needsWater();

        garden.needsWater2();
        garden.wateringGarden(40);
        garden.wateringGarden(70);


    }
}







