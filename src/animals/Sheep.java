package animals;

public class Sheep extends Animal{
    public Sheep() {
        this.name = "Sheep";
        this.type = "herbivorous";
        this.size = Size.BIG;
        this.specialCare = "shave";
    }

    @Override
    public String pet() {
        return name + " says: Meeeehhm!";
    }
    @Override
    public String toString() {
        return "Sheep{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
