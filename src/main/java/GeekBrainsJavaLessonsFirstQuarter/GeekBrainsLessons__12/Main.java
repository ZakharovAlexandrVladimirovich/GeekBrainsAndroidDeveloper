package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLessons__12;


//region ПРАКТИЧЕСКОЕ ЗАДАНИЕ
//        Необходимо написать два метода, которые делают следующее:
//        1) Создают одномерный длинный массив, например:
//        static final int SIZE = 10 000 000;
//        static final int HALF = size / 2;
//        float[] arr = new float[size].
//
//        2) Заполняют этот массив единицами.
//        3) Засекают время выполнения: long a = System.currentTimeMillis().
//        4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
//
//        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//
//
//        5) Проверяется время окончания метода System.currentTimeMillis().
//        6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
//
//                Отличие первого метода от второго:
//        Первый просто бежит по массиву и вычисляет значения.
//        Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.

//        Пример деления одного массива на два:
//        System.arraycopy(arr, 0, a1, 0, h);
//        System.arraycopy(arr, h, a2, 0, h).
//
//        Пример обратной склейки:
//        System.arraycopy(a1, 0, arr, 0, h);
//        System.arraycopy(a2, 0, arr, h, h).
//
//        Примечание:
//        System.arraycopy() — копирует данные из одного массива в другой:
//        System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение,
//        откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
//        По замерам времени:
//        Для первого метода надо считать время только на цикл расчета:
//        for (int i = 0; i < size; i++) {
//        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//        }
//
//
//        Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
//endregion

import java.util.Arrays;

public class Main {
    public static final int SIZE = 10_000_000;
    public static final int HALF = SIZE / 2;
    public static float[] arrays = new float[SIZE];
    public static float[] arrays3 = new float[SIZE];
    public static float[] arrays1 = new float[HALF];
    public static float[] arrays2 = new float[HALF];


    public static void extracted() {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (float) (arrays[i] * Math.sin(0.2f + (float) i / 5) *
                    Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
    }

    private static void extracted1() {
        new Thread(() -> {
            System.arraycopy(arrays3, 0, arrays1, 0, HALF);
            for (int i = 0; i < HALF; i++) {
                arrays1[i] = (float) (arrays1[i] * Math.sin(0.2f + (float) i / 5) *
                        Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
            }
            System.arraycopy(arrays1, 0, arrays3, 0, HALF);
        }).start();
    }

    private static void extracted2() {
        new Thread(() -> {
            System.arraycopy(arrays3, HALF, arrays2, 0, HALF);
            for (int i = 0; i < HALF; i++) {
                arrays2[i] = (float) (arrays2[i] * Math.sin(0.2f + (float) i / 5) *
                        Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
            }
            System.arraycopy(arrays2, 0, arrays3, HALF, HALF);
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {

        //region Вариант с Одним потоком:
        Arrays.fill(arrays, 1);
        long start = System.currentTimeMillis();
        extracted();
        long end = System.currentTimeMillis();
        System.out.println(end - start + " Один Поток.");
        //endregion

        //region Вариант с Двумя потоками:
        Arrays.fill(arrays3, 1);
        long start1 = System.currentTimeMillis();
        extracted1();
        extracted2();
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1 + " Два Потока.");
        Thread.sleep(3000);
        System.out.println(Arrays.toString(arrays3));
        //endregion

    }

}

