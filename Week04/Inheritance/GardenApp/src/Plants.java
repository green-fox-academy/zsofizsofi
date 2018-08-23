

public class Plants {

    private String plantType;
    private String color;
    private double amountOfWater;
    private int minimalWater;
    private double absorbeation;

    public String getPlantType() {
        return plantType;
    }
    public String getColor() {
        return color;
    }

    public double getAmountOfWater() {
        return amountOfWater;
    }

    public int getMinimalWater() {
        return minimalWater;
    }

    public double getAbsorbeation() {
        return absorbeation;
    }

    public Plants(String plantType, String color, int minimalWater, double absorbeation){
        this.plantType = plantType;
        this.color= color;
        this.amountOfWater=0;
        this.minimalWater= minimalWater;
        this.absorbeation= absorbeation;
    }

    public void needsWater() {
        if(this.amountOfWater<minimalWater ) {
            System.out.println("The " + color + " " + plantType + " needs water.");
        } else {
            System.out.println("The" + color + " " + plantType + " doesn't need water.");
        }
    }

}
