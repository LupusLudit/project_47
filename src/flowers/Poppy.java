package flowers;

public class Poppy extends Flower{

    public Poppy() {
        this.name = "Poppy";
        this.price = 5;
        this.neededArea = 1.5;
        this.chanceOfGrowth = 0.60;
    }

    @Override
    public void water() {
        if(chanceOfGrowth + 0.1 < 1){
            chanceOfGrowth += 0.1;
        }
    }

    @Override
    public String toString() {
        return "Poppy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
