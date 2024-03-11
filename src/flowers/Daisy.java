package flowers;

public class Daisy extends Flower{

    public Daisy() {
        this.name = "Daisy";
        this.price = 3;
        this.neededArea = 0.25;
        this.chanceOfGrowth = 0.80;
    }

    @Override
    public void water() {
        if(chanceOfGrowth + 0.1 < 1){
            chanceOfGrowth += 0.1;
        }
    }

    @Override
    public String toString() {
        return "Daisy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
