package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsJavaLessons1.GeekBrainsLesson1.GeekBrainsLesson6;



import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsJavaLessons1.GeekBrainsLesson1.GeekBrainsLesson6.Animal.Animals;

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
