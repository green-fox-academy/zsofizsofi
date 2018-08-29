/**
 * Created by aze on 2017.03.29..
 */
public class Thing {
    String name;
    boolean completed;

    Thing(String name) {
        this.name = name;
    }

    void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }
}