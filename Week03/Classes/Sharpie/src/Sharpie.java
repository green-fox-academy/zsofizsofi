public class Sharpie {

    String color;
    float width;
    private float inkAmount;

    Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }


    public float setInkAmount(float inkAmount) {
        this.inkAmount = inkAmount;
        return inkAmount;
    }

    public float getInkAmount() {
        return inkAmount;
    }

    float getInkAmount2() {
        this.inkAmount = inkAmount - 1;
        return inkAmount;
    }

    public String toString() {
        return this.color;
    }

}
