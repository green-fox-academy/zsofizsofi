import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> listOfAnimal;
    private int freePlaces;

    public Farm(int freePlaces) {
        this.freePlaces = freePlaces;
        this.listOfAnimal = new ArrayList<>();
    }


    public Animal breed() {
        if (this.freePlaces > 0) {
            return new Animal(40,30);
        }
        return null;
    }


    public Animal findTheLeastHungryAnimal() {
        for (Animal animal : listOfAnimal) {
            int leastHunger = 0;
            if (animal.hunger > leastHunger) {
                leastHunger = animal.hunger;
            }
            return animal;
        }
        return null;
    }

    public List<Animal> slaughter() {
        Animal animal1= new Animal();
        int leastHunger = 0;
        for (Animal animal : listOfAnimal) {

            if (animal.hunger > leastHunger) {
                leastHunger = animal.hunger;
            }

        }
        listOfAnimal.remove(animal1);
        return listOfAnimal;



        public void slaughter() {
            int max = 0;
            for (Animal animal : animals) {
                if (animal.hunger > max) max = animal.hunger;
            }
            for (Animal animal : animals) {
                if (animal.hunger == max) animals.remove(animal);
            }
    }
}


//    Create a Farm class
//it has list of Animals
//                it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal