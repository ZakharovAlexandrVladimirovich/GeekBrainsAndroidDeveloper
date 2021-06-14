package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson11;

import java.util.*;

//region Урок 10. Коллекции
//        1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//           Найти и вывести список уникальных слов,из которых состоит массив (дубликаты не считаем). (используй сет)
//
//        2. Посчитать, сколько раз встречается каждое слово. (используй мап)
//endregion
public class Main {

    public static void main(String[] args) {

        String[] fruits = {"Яблоко", "Груша", "Апельсин", "Апельсин", "Манго", "Киви", "Яблоко", "Киви", "Банан",
                "Яблоко", "Банан", "Груша", "Лимон", "Мандарин", "Киви"};
        HashSet<String> fruits2 = new HashSet<>();
        Collections.addAll(fruits2, fruits);
        System.out.println(fruits2);
        System.out.println(fruits2.size());

        HashMap<String, Integer> fruitsMap = new HashMap<>();

        for (String fruit : fruits) {
            if (fruitsMap.containsKey(fruit)) {
                fruitsMap.put(fruit, fruitsMap.get(fruit) + 1);
            } else {
                fruitsMap.put(fruit, 1);
            }
        }
        System.out.println(fruitsMap);
    }
}
