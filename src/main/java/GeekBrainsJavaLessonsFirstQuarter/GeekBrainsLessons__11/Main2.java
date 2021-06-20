package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLessons__11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void permutation(String[] strings,int a, int b){

        String string = strings[a];
        strings[a] = strings[b];
        strings[b] = string;
        System.out.println(Arrays.toString(strings));
    }
    public static ArrayList<Object> arrayToList(String[] strings){
        return new ArrayList<>(Arrays.asList((strings)));
    }
    public static void main(String[] args) {
//    1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

//    2. Написать метод, который преобразует массив в ArrayList;



        String[] strings = new String[]{"1", "2", "3", "4"};
        permutation(strings,0,3);

        System.out.println("**************************");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        stringArrayList.add("4");
        String string1= stringArrayList.get(1);
        stringArrayList.add(1,stringArrayList.get(3));
        stringArrayList.remove(2);
        stringArrayList.add(3,string1);
        stringArrayList.remove(4);
        System.out.println(stringArrayList);


        ArrayList<Object> objects = arrayToList(strings);
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
