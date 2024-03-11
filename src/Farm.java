import animals.Animal;
import animals.Size;
import flowers.Flower;

import java.util.ArrayList;

public class Farm {

    private int bigCount = 0;
    private int smallCount = 0;

    private int flowerTypeCount = 0;

    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Flower> flowers = new ArrayList<>();

    /**
     * Simulates purchase of an animal
     * */
    public void buyAnimal(Animal animal){
        if(animal.getSize() == Size.BIG && bigCount < 10){
            animals.add(animal);
            bigCount++;
        }else if(animal.getSize() == Size.SMALL && smallCount < 10){
            animals.add(animal);
            smallCount++;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Too many animals in barn.");
        }
    }

    /**
     * Simulates sale of an animal
     * */
    public void sellAnimal(int index){
        if(animals.get(index)!= null){
            animals.remove(index);
        }
        else {
            throw new NullPointerException("No animal at this index");
        }
    }

    /**
     * Pets animal at a certain index
     * */

    public String pet(int index){
        if(animals.get(index)!= null){
            return animals.get(index).pet();
        }
        throw new NullPointerException("No animal at this index");

    }

    //I didnt have enough time to finish all the methods

}
