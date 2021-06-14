package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_9;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException() {

        System.err.println("В метод можно передать массив только вида: String[4][]");
    }
}
