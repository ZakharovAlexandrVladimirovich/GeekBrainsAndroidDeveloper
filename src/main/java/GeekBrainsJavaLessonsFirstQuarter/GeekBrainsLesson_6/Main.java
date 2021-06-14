package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_6;


import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_6.Animal.Animals;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_6.Animal.Cat;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_6.Animal.Dog;

public class Main {
    // region Объекты
    public static Zoo zooCat = new Zoo();
    public static Zoo zooDog = new Zoo();
    public static Zoo zooCatDog = new Zoo();
    public static Animals cat1 = new Cat("Маруся", "Колор Пойнт", 6, 150, 1.8f);
    public static Animals cat2 = new Cat("Ива", "Тигровый", 3, 180, 1.6f);
    public static Animals cat3 = new Cat("Базилио", "Рыжий", 10, 200, 2);
    public static Animals dog1 = new Dog("Бобик", "Белый", 7, 400, 0.8f, 8);
    public static Animals dog2 = new Dog("Шарик", "Черный", 3, 500, 0.6f, 10);
    public static Animals dog3 = new Dog("Тузик", "Коричневый", 5, 300, 0.5f, 9);
    public static Animals[] animals = new Animals[]{cat1, cat2, cat3, dog1, dog2, dog3};
    // endregion
    private static final float RUN_DISTANCE = 343.9f, JUMP_DISTANCE = 1.5f, SWIMMING_DISTANCE = 8.9f;

    public static void testData() {
        System.out.printf("Бег на : %.1fм\t Прыжки:%.1fм\t Заплыв на: %.1fм\n", RUN_DISTANCE, JUMP_DISTANCE, SWIMMING_DISTANCE);
    }

    public static void test(Animals animals) {
        animals.runTest(RUN_DISTANCE);
        animals.jumpTest(JUMP_DISTANCE);
        animals.swimmingTest(SWIMMING_DISTANCE);
        System.out.println();
    }

    public static void megaTest(Animals animals) {
        animals.animalEndurance();
        testData();
        test(animals);
    }

    public static void main(String[] args) {

        for (Animals animal : animals) {
            megaTest(animal);
        }
 //region  ЭКСПЕРЕМЕНТЫ.
        zooCat.addAnimals(cat1, cat2, cat3);
        zooDog.addAnimals(dog1, dog2, dog3);
        zooCatDog.addAnimals(cat1, cat2, cat3,dog1, dog2, dog3);
        zooCatDog.getAnimals().forEach(animals -> {
            for (Animals animal : animals) {
                megaTest( animal);
            }
        });
 //endregion
        System.err.printf("Всего  животных %d", Animals.counter);
    }


}
