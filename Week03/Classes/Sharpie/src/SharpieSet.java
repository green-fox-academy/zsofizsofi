import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    private List<Sharpie> listOfSharpies = new ArrayList<>();

    public void setListOfSharpies() { //konstruktor, de kb tök fölösleges
        this.listOfSharpies = listOfSharpies; //ez nem is kell ide, üresen is jó
    }

    public void addSharpie(Sharpie sharpie1) {
        listOfSharpies.add(sharpie1);
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : listOfSharpies) {
            if (sharpie.getInkAmount() > 0) count++;
        }
        return count;
    }

    public List<Sharpie> removeTrash() {
        for (Sharpie sharpie : listOfSharpies) {
            if (sharpie.getInkAmount() == 0) {
                listOfSharpies.remove(sharpie);
            }
        }
        return listOfSharpies;
    }
}





