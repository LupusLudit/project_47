package flowers;

public class Lily extends Flower{

    public Lily() {
        this.name = "Lily";
        this.price = 2;
        this.neededArea = 0.5;
        this.chanceOfGrowth = 0.70;
    }

    @Override
    public void water() {
        if(chanceOfGrowth + 0.05 < 1){
            chanceOfGrowth += 0.05;
        }
    }

    @Override
    public String toString() {
        return "Lily{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
