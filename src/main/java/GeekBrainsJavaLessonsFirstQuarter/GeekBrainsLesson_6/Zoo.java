package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_6;





import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_6.Animal.Animals;

import java.util.ArrayList;

public class Zoo {
    private final ArrayList<Animals[]> animals = new ArrayList<>();

    public void addAnimals(Animals...animal) {

        animals.add(animal);
    }

    public ArrayList<Animals[]> getAnimals() {

        return animals;
    }



}
