package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[][] strings = new String[4][4];
    public static File file = new File("Lesson9");
    public static Scanner scanner;

    static {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }
    }

    static {
        while (scanner.hasNextLine()) {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length; j++) {
                    strings[i][j] = scanner.next();
                }
            }
        }
        scanner.close();
    }

//       public static String[][] strings = {
//            {"g", "2", "5", "привет"},
//            {"Java", "2", "Array", "5"},
//            {"s", "1", "5", "+"},
//            {"6", "шесть", "0", "пока" },
//               {"g"}
//
//    };

    private static void string(String[][] string) throws MyArraySizeException, MyArrayDataException {
        if (lengthArray(string)) return;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (isItNumber((string[i][j]))) {
                    sum += Integer.parseInt(string[i][j]);
                } else {
                    try {
                        throw new MyArrayDataException(string[i][j], i, j);
                    } catch (MyArrayDataException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.printf("Сумма значений массива приведенных к типу int равна %d\n", sum);
    }

    private static boolean lengthArray(String[][] string) {
        if (string.length != 4) {
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                return true;
            }
        }
        return false;
    }

    private static boolean isItNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(strings));
        try {
            string(strings);
        } catch (MyArrayDataException e) {
            System.out.println("Привект");
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
