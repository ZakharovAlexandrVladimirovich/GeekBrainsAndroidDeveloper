package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLessons__11;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<Apple> applesBox = new ArrayList<>();
    private ArrayList<Orange> orangesBox = new ArrayList<>();

    private int weightBox = 0;

    public void addFruitInBox(T fruit) {
        if (fruit instanceof Apple) {
            applesBox.add((Apple) fruit);
            System.out.println("В коробку с яблоками положили яблоко");
        } else if (fruit instanceof Orange) {
            orangesBox.add((Orange) fruit);
            System.out.println("В коробку с апельсинами положили апельсин");
        }
        this.weightBox += fruit.getWeight();
    }

    public void getWeight(ArrayList<T> TBox) {
        for (T t : TBox) {
            weightBox += t.getWeight();
        }
        System.out.println("Вес коробки " + weightBox);
    }

    public void compare(Box<?> box) {

        if (this.weightBox == box.weightBox) {
            System.out.println("Коробки равны по весу:");

        } else {
            System.out.println("Коробки разные по весу:");
        }
    }
//    public void transfer(ArrayList<T> TBox){
//        if (this. instanceof Apple){
//
//        }
//
//    }


    public ArrayList<Apple> getApplesBox() {
        return applesBox;
    }

    public void setApplesBox(ArrayList<Apple> applesBox) {
        this.applesBox = applesBox;
    }

    public ArrayList<Orange> getOrangesBox() {
        return orangesBox;
    }

    public void setOrangesBox(ArrayList<Orange> orangesBox) {
        this.orangesBox = orangesBox;
    }

    public int getWeightBox() {
        return weightBox;
    }

    public void setWeightBox(int weightBox) {
        this.weightBox = weightBox;
    }

}
