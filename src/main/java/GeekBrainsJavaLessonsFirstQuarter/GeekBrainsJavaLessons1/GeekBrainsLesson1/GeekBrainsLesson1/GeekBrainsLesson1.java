package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsJavaLessons1.GeekBrainsLesson1.GeekBrainsLesson1;

import java.util.Scanner;


public class GeekBrainsLesson1 {

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static float myNumber() {

        while (true) {
            while (!scanner.hasNextFloat()) {
                System.out.println("Можно вводить только цифры:");
                scanner.nextLine();
            }
            return scanner.nextFloat();
        }
    }

    public static boolean sumNumbers(int myNum1, int myNum2) {

        boolean sum = (myNum1 + myNum2) >= 10;
        if (sum) {
            sum = (myNum1 + myNum2) <= 20;

        }
        return sum;

    }

    public static void chetIneChet(int myNum) {

        boolean a = myNum < 0;
        if (a) {
            System.out.println("Число отрицательное\n");
        } else {
            System.out.println("Число положительное\n");
        }
    }

    public static boolean boolBoolean(int myNum1) {

        return myNum1 < 0;
    }

    public static void hello(String myName) {

        System.out.println("Привет " + myName + " !!!");
    }

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        // region  1. Создать переменные всех пройденных типов данных и инициализировать их значения.
        {
            short hello = 0;
            int _m = 1;
            long y = 2L;
            float n = 3.45f;
            double a = 6.789d;
            char m = 65;
            byte e = 90;
            boolean i = a < a;
            String s = "Александр";
            System.out.println(a);
        }
        //endregion

        //   region 2.


        System.out.println("\n\nНаписать метод вычисляющий выражение a * (b + (c / d)) и возвращающий ,\n" +
                "где a, b, c, d – аргументы этого метода, имеющие тип float.");
        System.out.println("Метод вычисляющий выражение a * (b + (c / d))");

        System.out.println("Введите - a:");
        float a = myNumber();

        System.out.println("Введите - b:");
        float b = myNumber();

        System.out.println("Введите - c:");
        float c = myNumber();

        float d;
        do {
            System.out.println("Введите - d:  Не равное нулю.");
            d = myNumber();
            System.out.println("Деление на нуль невозможно!!!");
        } while (d == 0);

        scanner.nextLine();

        System.out.println("Результат выражения:  a * (b + (c / d)) = " + calculate(a, b, c, d));
        System.out.printf("Результат выражения:  a * (b + (c / d)) = " + "%.2f", calculate(a, b, c, d));

//endregion

        // region 3.


        System.out.println("\n\nНаписать метод, принимающий на вход два целых числа и проверяющий, что их сумма \n" +
                "лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.");
        System.out.println("Протестируйте 5 раз.\n");

        for (int j = 1; j < 6; j++) {
            System.out.println("Тест № " + j);

            System.out.println("Введите первое число:");
            int myNum1 = (int) myNumber();

            System.out.println("Введите второе число:");
            int myNum2 = (int) myNumber();

            System.out.println("Сумма чисел = " + sumNumbers(myNum1, myNum2));
            System.out.println();
            scanner.nextLine();

        }


//
        //endregion

        // region  4.

        System.out.println("\nНаписать метод, которому в качестве параметра передается целое число, \n" +
                "метод должен напечатать в консоль,положительное ли число передали или отрицательное. \n" +
                "Замечание: ноль считаем положительным числом.");
        System.out.println("Протестируйте 5 раз.\n");

        for (int j = 1; j < 6; j++) {
            System.out.println("Тест № " + j);

            System.out.println("Введите целое число:");
            int myNum = (int) myNumber();
            chetIneChet(myNum);
        }

        // endregion

        //        region  5.
        System.out.println("\nНаписать метод, которому в качестве параметра передается целое число. \n" +
                "Метод должен вернуть true,если число отрицательное, и вернуть false если положительное.");
        System.out.println("Протестируйте 5 раз.\n");

        for (int j = 1; j < 6; j++) {
            System.out.println("\nТест № " + j);

            System.out.println("Введите целое число:");
            int myNum3 = (int) myNumber();
            System.out.println(boolBoolean(myNum3));
        }

        //        endregion

        //  region 6.
        System.out.println("\n\n метод, которому в качестве параметра передается строка, обозначающая имя.\n" +
                "Метод должен вывести в консоль сообщение «Привет, указанное_имя!».\n");

        System.out.println("Введите ваше имя:");
        scanner.nextLine();
        String myName = scanner.nextLine();
        hello(myName);

        //        endregion

        //        region 7.

        System.out.println("\n\n*Написать метод, который определяет, является ли год високосным, \n" +
                "и выводит сообщение в консоль.Каждый 4-й год является високосным, кроме каждого 100-го, \n" +
                "при этом каждый 400-й – високосный.");
        System.out.println("Протестируйте 5 раз.\n");

        for (int j = 1; j < 6; j++) {
            System.out.println("Тест № " + j);

            System.out.println("Введите год:");
            int year = (int) myNumber();

            if (year % 400 == 0) {
                System.out.println(year + " год является високосным!\n");

            } else if ((year % 100 == 0) || (year % 4 != 0)) {
                System.out.println(year + " год НЕ является високосным!\n");

            } else
                System.out.println(year + " год является високосным!\n");
        }
        System.out.println("\n\nПОЗДРАВЛЯЮ !!! ВЫ ЗАКАНЧИЛИ ПРОВЕРКУ МОИХ ЗНАНИЙ )))) !!!");

        //        endregion


    }
}






