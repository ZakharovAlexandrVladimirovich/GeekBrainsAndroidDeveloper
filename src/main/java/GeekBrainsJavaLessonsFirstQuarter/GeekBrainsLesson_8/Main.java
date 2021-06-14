package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8;

import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Participant.Actions;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Barrier.RunningTrack;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Barrier.Wall;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Participant.Cat;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Participant.Human;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Participant.Robot;

import java.util.Random;

public class Main {
    //                                                 Практическое задание
//Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//
//Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//
//Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
//соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//
//Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
    public static Random random = new Random();
    public static Cat cat = new Cat(25);
    public static Robot robot = new Robot(30);
    public static Human human = new Human(20);
    public static RunningTrack runningTrack = new RunningTrack();
    public static Wall wall = new Wall();
    public static Object[] objects = {runningTrack, wall};
    public static Actions[] participants = {cat, robot, human};

    public static void win(int i) {
        if (i == 10) {
            System.out.println("Участник преодолел всю полосу препятствий.");
        }

    }

    public static void main(String[] args) {

        int i;
        for (Actions participant : participants) {
            for (i = 1; i <= 10; i++) {
                if (objects[random.nextInt(2)] instanceof Wall) {
                    wall = new Wall(random.nextInt(2) + 1);
                    if (participant.jum(wall)) {
                        win(i);
                    } else {
                        break;
                    }
                } else {
                    runningTrack = new RunningTrack(random.nextInt(3) + 2);
                    if (participant.run(runningTrack)) {
                        win(i);
                    } else {
                        break;
                    }
                }


            }

            System.out.println();
        }
    }
}
