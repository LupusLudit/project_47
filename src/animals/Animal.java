package animals;

public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    /**
     * returns a String containing reaction of an animal to the farmers pet
     * */
    public abstract String pet();
    @Override
    public String toString() {
        return "animals.Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }

    /**
     * returns animals size
     * */
    public Size getSize() {
        return size;
    }
}
