package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_9;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(String s, int i, int j) {
        System.err.printf("Не удалось привести значение '%s' к типу Int по индексу string[%d][%d]\n", s, i, j);
    }
}
