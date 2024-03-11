package animals;

public class Cow extends Animal{
    public Cow() {
        this.name = "Cow";
        this.type = "herbivorous";
        this.size = Size.BIG;
        this.specialCare = "milking";
    }

    @Override
    public String pet() {
        return name + " says: Moooooooo!";
    }

    @Override
    public String toString() {
        return "Cow{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }

}
