package animals;

public class Pig extends Animal{
    public Pig() {
        this.name = "Pig";
        this.type = "omnivore";
        this.size = Size.BIG;
        this.specialCare = "bathing";
    }

    @Override
    public String toString() {
        return "Pig{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
