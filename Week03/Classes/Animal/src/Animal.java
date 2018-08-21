public class Animal {
    int hunger;
    int thirst;

    Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    int eat() {
        this.hunger++;
        return this.hunger;
    }

    int drink() {
        this.thirst= this.thirst+1;
        return this.thirst;
    }

    int [] play() {
        this.thirst=this.thirst-1;
        this.hunger=this.hunger-1;
        return new int []{this.thirst, this.hunger};
    }

}



