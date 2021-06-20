package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLessons__11;

import java.util.ArrayList;


public class Box<T extends Fruit> {
    private ArrayList<T> tFruit = new ArrayList<>();

    private int weightBox = 0;

    public void addFruitInBox(T fruit) {
        if (fruit instanceof Apple) {
            tFruit.add(fruit);
            System.out.println("В коробку для яблок положили яблоко");
        } else if (fruit instanceof Orange) {
            tFruit.add(fruit);
            System.out.println("В коробку для апельсинов положили апельсин");
        }
        this.weightBox += fruit.getWeight();
    }


    public void getWeight() {
        System.out.println("Вес коробки " + this.weightBox);
    }

    public void compare(Box<?> box) {

        if (this.weightBox == box.weightBox) {
            System.out.println("Коробки равны по весу:");

        } else {
            System.out.println("Коробки разные по весу:");
        }
    }

    public void transferTo(Box<T> tBox) {

        tBox.tFruit = this.tFruit;
        this.tFruit = null;

    }

    public ArrayList<T> gettFruit() {
        return tFruit;
    }
}
