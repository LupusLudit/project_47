package flowers;

public class Sunflower extends Flower{

    public Sunflower() {
        this.name = "Sunflower";
        this.price = 12;
        this.neededArea = 2;
        this.chanceOfGrowth = 0.95;
    }

    @Override
    public void water() {
        if(chanceOfGrowth + 0.025 < 1){
            chanceOfGrowth += 0.025;
        }
    }

    @Override
    public String toString() {
        return "Sunflower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
