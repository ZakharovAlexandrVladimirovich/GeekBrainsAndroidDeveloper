package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson10;
import java.util.*;

//        3. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//           В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
//           искать номер телефона по фамилии.Следует учесть, что под одной фамилией может быть несколько телефонов
//           (несколько номеров у одного человека), тогда при запросе такой фамилии должны выводиться все телефоны.
//           Нет смысла хранить для одного человека несколько одинаковых номеров.
public class PhoneBook {

    public static String name;
    public static String number;
    public static HashMap<Integer, String> mapBook = new HashMap<>();


    public static void add(String name, int number) {
        mapBook.put(number, name);
    }

    public static void get(String name) {

        for (Map.Entry<Integer, String> o : mapBook.entrySet()) {
            if (name.equals(o.getValue())) {
                System.out.printf("Телефон %s - ",name );
                System.out.println(o.getKey());
            }
        }
    }

    public static void list() {
        for (Map.Entry<Integer, String> o : mapBook.entrySet()) {
            System.out.printf("%s : %s\n", o.getKey(), o.getValue());
        }
    }

    @Override
    public int hashCode() {

        return name.hashCode();
    }

    public static void main(String[] args) {
        PhoneBook.add("Саша", 11111);
        PhoneBook.add("Саша", 22222);
        PhoneBook.add("Петя", 33333);
        PhoneBook.add("Дима", 44444);
        PhoneBook.add("Рома", 55555);
        PhoneBook.add("Миша", 66666);
        PhoneBook.add("Миша", 77777);

        PhoneBook.list();
        System.out.println();
        PhoneBook.get("Саша");

    }
}
