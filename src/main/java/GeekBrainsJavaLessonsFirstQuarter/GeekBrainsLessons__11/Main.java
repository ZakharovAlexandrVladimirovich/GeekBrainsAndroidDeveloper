package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLessons__11;
//region ПРАКТИЧЕСКОЕ ЗАДАНИЕ

//    3. Задача:

//      a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

//      b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//      поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

//      c. Для хранения фруктов внутри коробки можно использовать ArrayList;

//      d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
//      вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

//      e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
//      которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//      Можно сравнивать коробки с яблоками и апельсинами;

//      f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//      Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//      Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

//      g. Не забываем про метод добавления фрукта в коробку.
//endregion


public class Main {

    public static Fruit apple = new Apple("Яблоко", 1);
    public static Orange orange = new Orange("Апельсин", 2);
    public static Box<Apple> appleBox = new Box<>();
    public static Box<Apple> appleBox2 = new Box<>();
    public static Box<Orange> orangeBox = new Box<>();


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            appleBox.addFruitInBox((Apple) apple);
        }

        for (Apple apple : appleBox.gettFruit()) {
            System.out.println(apple.getName());
        }

        System.out.println(appleBox.gettFruit());


        for (int i = 0; i < 10; i++) {
            orangeBox.addFruitInBox(orange);
        }

        appleBox.getWeight();
        orangeBox.getWeight();
        appleBox.compare(orangeBox);

        appleBox.transferTo(appleBox2);

        for (Apple apple1 : appleBox2.gettFruit()) {
            System.out.println(apple1.getName());
        }
        System.out.println(appleBox.gettFruit());


    }

}
