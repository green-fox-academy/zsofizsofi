import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> listOfSharpies = new ArrayList<>();

    public void setListOfSharpies(List<Sharpie> listOfSharpies) {
        this.listOfSharpies = listOfSharpies;
    }


    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : listOfSharpies) {
            if (sharpie.inkAmount > 0) count++;
        }
        return count;
    }

    public void removeTrash() {
        for (Sharpie sharpie : listOfSharpies) {
            if (sharpie.inkAmount == 0) listOfSharpies.remove(sharpie);
        }
    }
}
//    it contains a list of Sharpie
//    countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies