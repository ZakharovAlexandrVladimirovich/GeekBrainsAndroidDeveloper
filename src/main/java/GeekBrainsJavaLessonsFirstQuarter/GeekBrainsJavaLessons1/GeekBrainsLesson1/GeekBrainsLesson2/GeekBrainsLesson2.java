package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsJavaLessons1.GeekBrainsLesson1.GeekBrainsLesson2;

import java.util.Arrays;
import java.util.Random;

public class GeekBrainsLesson2 {
    public static Random random = new Random();


    public static int[] arr(int[] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 1) {
                arrays[i] = 0;
            } else {
                arrays[i] = 1;
            }
        }
        return arrays;
    }

    public static int[] multyMassive(int[] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 6) {
                arrays[i] = arrays[i] * 2;
            }
        }
        return arrays;
    }

    public static int[][] mnogomerMassive(int[][] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            arrays[i][i] = 1;
            arrays[arrays.length - 1 - i][i] = 1;
        }
        return arrays;
    }

    public static int[] newRandomArrays() {

        int[] arrays6 = new int[random.nextInt(11) + 10];
        for (int i = 0; i < arrays6.length; i++) {
            arrays6[i] = random.nextInt(11);
        }
        return arrays6;
    }

    public static void minMaxNumberMassive1(int[] arrays) {

        int[] min = new int[arrays.length];
        int[] max = new int[arrays.length];

        for (int i = 0, j = 0; i < arrays.length; i++) {
            max[i] = min[i] = arrays[i];

            if (min[0] > min[i]) {
                min[0] = min[i];
                j++;
            } else if (max[0] < max[i]) {
                max[0] = max[i];
            }
        }
        minMax(min[0], max[0]);
    }

    public static void minMaxNumberMassive2(int[] arrays) {

        int[] min = new int[arrays.length];
        int[] max = new int[arrays.length];
        int i = 0;
        for (int z : arrays) {

            max[i] = min[i] = z;


            if (min[0] > z) {
                min[0] = z;
            } else if (max[0] < z) {
                max[0] = z;
            }
            i++;
        }
        minMax(min[0], max[0]);
    }

    public static void minMaxNumberMassive3(int[] arrays) {

        int min, max;
        min = max = arrays[0];

        for (int i = 0; i < arrays.length; i++) {

            if (min > arrays[i]) {
                min = arrays[i];
            } else if (max < arrays[i]) {
                max = arrays[i];
            }
        }
        minMax(min, max);
    }

    public static void minMaxNumberMassive4(int[] arrays) {

        int min, max;
        min = max = arrays[0];

        for (int j : arrays) {

            if (min > j) {
                min = j;
            } else if (max < j) {
                max = j;
            }
        }
        minMax(min, max);
    }

    public static void minMax(int min, int max) {

        System.out.println("Минимальное значение массива " + min);
        System.out.println("Максимальное значение массива " + max);

    }

    public static int summaMassive(int[] arrays) {
        int sumMassive = 0;
        for (int i : arrays) {
            sumMassive += i;
        }
        return sumMassive;
    }

    public static void checkBalance(int[] arrays, int balances, int sumMassive) {

        for (int i = 0; i < arrays.length; i++) {
            balances -= arrays[i];

            if (sumMassive % 2 != 0 || balances < 0) {
                System.out.println("Баланса нет");
                break;
            } else if (balances == 0) {
                System.out.println("Баланс массива после " + i + " индекса");
                break;
            }
        }
    }

    public static void balance(int[] arrays) {
        int balanceSum = 0, arraysSum = 0, i = 0;
        for (int z : arrays) {
            arraysSum += z;
        }
        for (int l : arrays) {
            {
                balanceSum += l;
            }
            if (balanceSum > arraysSum / 2 || arraysSum % 2 != 0) {
                System.out.println("Баланса нету\n");
                break;
            } else if (arraysSum / 2 == balanceSum) {
                System.out.println("Сумма массива: " + arraysSum);
                System.out.println("Баланс: " + arraysSum / 2);
                System.out.println("Длинна массива: " + arrays.length);
                System.out.println("Баланс после: " + i + " индекса\n");
                break;
            }
            i++;

        }
    }

    public static void rotationMassive(int[] arrays, int rotation) {

        for (int i = 0; i < Math.abs(rotation); i++) {

            if (rotation < 0) {
                int b = arrays[0];
                for (int j = 0; j < arrays.length - 1; ) {
                    arrays[j] = arrays[++j];
                }
                arrays[arrays.length - 1] = b;
                System.out.println(Arrays.toString(arrays));

            } else if (rotation > 0) {
                int b = arrays[arrays.length - 1];
                for (int j = arrays.length - 1; j > 0; ) {
                    arrays[j] = arrays[--j];
                }
                arrays[0] = b;
                System.out.println(Arrays.toString(arrays));

            }
        }
    }

    public static boolean balance2(int[] arrays) {

        int balSum = 0, arrSum = 0;
        for (int z : arrays) {
            arrSum += z;
        }
        if (arrSum % 2 != 0) {
            return false;
        }
        int i = 0;
        while (!(balSum >= arrSum / 2)) {
            balSum += arrays[i++];
        }
        return balSum == arrSum / 2;
    }

    public static void main(String[] args) {
//      Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].С помощью
//      цикла и условия заменить 0 на 1, 1 на 0;

        int[] arrays1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("до    " + Arrays.toString((arrays1)));
        System.out.println("после " + Arrays.toString(arr(arrays1)));

//      Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arrays2 = new int[8];
        for (int i = 0, j = 0; i < arrays2.length; i++, j += 3) {
            arrays2[i] = j;
        }

        System.out.println("\nВариант № 1 " + Arrays.toString(arrays2));

        int[] arrays3 = new int[8];
        for (int i = 0; i < arrays3.length; i++) {
            arrays3[i] = i * 3;
        }

        System.out.println("Вариант № 2 " + Arrays.toString(arrays3));

//      Задать массив[ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arrays4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("\nдо    " + Arrays.toString((arrays4)));
        System.out.println("после " + Arrays.toString((multyMassive(arrays4))));
        System.out.println();

//      Создать квадратный двумерный целочисленный массив(количество строк и столбцов одинаковое),
//      и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arrays5 = new int[7][7];
        for (int i = 0; i < arrays5.length; i++) {
            System.out.println(Arrays.toString((mnogomerMassive(arrays5)[i])));
        }

        System.out.println();

//   ** Задать одномерный массив и найти в нем минимальный и максимальный элементы(без помощи интернета);

        int[] arrays6 = newRandomArrays();
        System.out.println(Arrays.toString(arrays6));
        minMaxNumberMassive1(arrays6);
        System.out.println(Arrays.toString(arrays6));
        System.out.println("*********************************************************************");
        System.out.println(Arrays.toString(arrays6));
        minMaxNumberMassive2(arrays6);
        System.out.println(Arrays.toString(arrays6));
        System.out.println("*********************************************************************");
        System.out.println(Arrays.toString(arrays6));
        minMaxNumberMassive3(arrays6);
        System.out.println(Arrays.toString(arrays6));
        System.out.println("*********************************************************************");
        System.out.println(Arrays.toString(arrays6));
        minMaxNumberMassive4(arrays6);
        System.out.println(Arrays.toString(arrays6));

//   ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//      если в массиве есть место, в котором сумма левой и правой части массива равны.
//      Примеры: checkBalance([2, 2, 2, 1, 2, 2, ||10, 1]) →true, checkBalance([1, 1, 1, ||2, 1]) →true,
//      граница показана символами ||,эти символы в массив не входят.


        int[] arrays7 = newRandomArrays();
        System.out.println();
        System.out.println(Arrays.toString(arrays7));
        int sumMassive = summaMassive(arrays7);
        System.out.println("Сумма массива " + sumMassive);
        int balances = sumMassive / 2;
        System.out.println("Баланс массива " + balances);
        checkBalance(arrays7, balances, sumMassive);
        System.out.println("****************************************************************************\n");

        System.out.println("Вариант № 2");
        System.out.println(Arrays.toString(arrays7));
        balance(arrays7);
        System.out.println("****************************************************************************");
        System.out.println("Вариант № 3");

        System.out.println(Arrays.toString(arrays7));
        System.out.println(balance2(arrays7));
        System.out.println();

// **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//      или отрицательным),при этом метод должен сместить все элементы массива на n позиций.
//      Элементы смещаются циклично.Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//      Примеры: [1, 2, 3 ]при n = 1 (на один вправо) ->[3, 1, 2 ];
//            [3, 5, 6, 1] при n = -2 (на два влево) ->[6, 1, 3, 5 ].
//            При каком n в какую сторону сдвиг можете выбирать сами.

        int[] arrays8 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrays8));
        int rotation = 10;
        rotationMassive(arrays8, rotation);
    }
}
