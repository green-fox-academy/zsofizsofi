import java.util.ArrayList;

/**
 * Created by aze on 2017.03.29..
 */
public class Fleet {
    ArrayList<Thing> things;

    Fleet() {
        things = new ArrayList<>();
    }

    void add(Thing thing) {
        things.add(thing);
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < things.size(); i++) {
            result += (i+1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}