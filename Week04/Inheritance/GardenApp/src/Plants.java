

public class Plants {

    private String plantType;
    private String color;
    private double currentWater;
    private int minimalWater;
    private double absorbeation;

    public String getPlantType() {
        return plantType;
    }

    public String getColor() {
        return color;
    }

    public double getCurrentWater() {
        return currentWater;
    }

    public int getMinimalWater() {
        return minimalWater;
    }

    public double getAbsorbeation() {
        return absorbeation;
    }

    public Plants(String plantType, String color, int minimalWater, double absorbeation) {
        this.plantType = plantType;
        this.color = color;
        this.currentWater = 0;
        this.minimalWater = minimalWater;
        this.absorbeation = absorbeation;
    }

    public boolean needsWater() {
        if (this.currentWater < this.minimalWater) {
            //System.out.println("The " + color + " " + plantType + " needs water.");
            return true;
        } else {
            //System.out.println("The" + color + " " + plantType + " doesn't need water.");
            return false;
        }
    }

    public void wateringPlants(int water) {
        this.currentWater=+(water*this.absorbeation);
        System.out.println("The " + this.color + " " + this.plantType + " got water.");
    }

}
