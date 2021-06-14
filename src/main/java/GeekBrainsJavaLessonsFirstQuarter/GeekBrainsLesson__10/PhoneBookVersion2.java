package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson__10;

import java.util.*;
import java.lang.*;

//        3. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//           В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
//           искать номер телефона по фамилии.Следует учесть, что под одной фамилией может быть несколько телефонов
//           (несколько номеров у одного человека), тогда при запросе такой фамилии должны выводиться все телефоны.
//           Нет смысла хранить для одного человека несколько одинаковых номеров.
class PhoneBookVersion2 {
    private static final HashMap<String, HashSet<String>> phoneBookMap = new HashMap<>();

    public static void add(String keyName, String valuePhoneNumber) {
        HashSet<String> phoneNumberSet;
        if (phoneBookMap.containsKey(keyName)) {
            phoneNumberSet = phoneBookMap.get(keyName);
        } else {
            phoneNumberSet = new HashSet<>();
        }
        phoneNumberSet.add(valuePhoneNumber);
        phoneBookMap.put(keyName, phoneNumberSet);
    }

    public static void list() {
        for (Map.Entry<String, HashSet<String>> o : phoneBookMap.entrySet()) {
            System.out.printf("%s : %s\n", o.getKey(), o.getValue());
        }
    }

    public static Set<String> get(String surname) {

        return phoneBookMap.get(surname);
    }

    public static void main(String[] args) {
        PhoneBookVersion2.add("Aleksandr", "89956249094");
        PhoneBookVersion2.add("Roma", "89127777777");
        PhoneBookVersion2.add("Vitaliy", "89123456789");
        PhoneBookVersion2.add("Anna", "89143434343");
        PhoneBookVersion2.add("Aleksandr", "89213709094");
        System.out.println(phoneBookMap.get("Aleksandr"));
        System.out.println(get("Aleksandr"));
        list();

    }

}

