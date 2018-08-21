
import java.util.Arrays;

public class DiceSet {

    public static void main(String[] args) {
        DiceSet dice = new DiceSet();
        dice.roll();
        do dice.reroll();
        while (Arrays.stream(dice.dices).sum() != 36) ;
        System.out.println(Arrays.toString(dice.dices));
    }

    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;


    }

    //dobtam 6-szor
//
//    public int[] getCurrent() {
//        return dices;
//    }
//    // ez mi?
//
//    public int getCurrent(int i) {
//        return dices[i];
//    }
//    //i-edikre ezt dobtam
//
//    do reroll (dices) {
//        while (
//             for dices[i]!=6);
//    }
//
    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }
//
//    public void reroll(int k) {
//        dices[k] = (int) (Math.random() * 6) + 1;
//    }



    }


    //int[] arr = {1, 2, 3, 4};
    //int sum = Arrays.stream(arr).sum();
    // dices.getCurrent();
    // dices.getCurrent(5);
    //dices.reroll();
    // dices.getCurrent();
    //dices.reroll(4);
    // dices.getCurrent();

//    You have a DiceSet class which has 6 dices
//        You can roll all of them with roll()
//        Check the current rolled numbers with getCurrent()
//        You can reroll with reroll()
//        Your task is to roll the dices until all of the dices are 6