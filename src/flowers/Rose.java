package flowers;

public class Rose extends Flower{

    public Rose() {
        this.name = "Rose";
        this.price = 1.5;
        this.neededArea = 1;
        this.chanceOfGrowth = 0.85;
    }

    @Override
    public void water() {
        if(chanceOfGrowth + 0.05 < 1){
            chanceOfGrowth += 0.05;
        }
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}

