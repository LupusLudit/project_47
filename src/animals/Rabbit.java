package animals;

public class Rabbit extends Animal{

    public Rabbit() {
        this.name = "Rabbit";
        this.type = "herbivorous";
        this.size = Size.SMALL;
        this.specialCare = "hay bed";
    }
    @Override
    public String pet() {
        return name + " says: Chuck chuck hrmm!";
    }
    @Override
    public String toString() {
        return "Rabbit{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
