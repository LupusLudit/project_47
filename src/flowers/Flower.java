package flowers;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    /**
     * Simulates watering a plant
     * */
    public abstract void water();


    public String toString() {
        return "flowers.Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
