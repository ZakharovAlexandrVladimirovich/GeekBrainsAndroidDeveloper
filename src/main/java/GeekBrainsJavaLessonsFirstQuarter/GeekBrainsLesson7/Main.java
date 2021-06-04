package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7;

import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7.Animal.Cat;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7.Animal.Mouse;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7.Food.CatFood;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7.Food.Plate;

public class Main {
    public static Mouse mouse = new Mouse("Джерри", 1, 2);
    public static CatFood catFood1 = new CatFood("Whiskas", 500, 5);
    public static CatFood catFood2 = new CatFood("Kitikate", 1000, 10);

    public static Plate plateCat1 = new Plate("Тарелка №1", 25);
    public static Plate plateCat2 = new Plate("Тарелка №2", 50);
    public static Plate plateCat3 = new Plate("Тарелка №3", 75);

    public static Cat cat1 = new Cat("Том", 8, 21);
    public static Cat cat2 = new Cat("Базилио", 10, 30);
    public static Cat cat3 = new Cat("Ива", 7, 25);
    public static Cat cat4 = new Cat("Маруся", 8, 15);
    public static Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4};

    public static void main(String[] args) {

        for (Cat cat : cats) {
            cat.eat(plateCat3);
            cat.Info();
            System.out.println();
        }
        plateCat3.getFoodTest();
        catFood1.addCatFoodToPlate(plateCat1);
        catFood2.addCatFoodToPlate(plateCat2);
        catFood2.addCatFoodToPlate(plateCat2);
        System.out.println(catFood2.getWeight());

        System.out.println();

        for (Cat cat : cats) {
            cat.hunts(mouse);
            cat.hunts(mouse);
            cat.hunts(mouse);
            cat.HuntsInfo();
            System.out.println();
        }


    }


}
