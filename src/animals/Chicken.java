package animals;

public class Chicken extends Animal{

    public Chicken() {
        this.name = "Chicken";
        this.type = "omnivore";
        this.size = Size.SMALL;
        this.specialCare = "combing";
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
