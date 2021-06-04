package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Participant;

import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Barrier.RunningTrack;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Barrier.Wall;

import java.util.Random;


public class Cat implements Actions {
    public static Random random = new Random();

    protected int stamina;

    public Cat(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public boolean jum(Wall wall) {
        if (this.stamina < wall.getHeight()) {
            System.out.println("Кот не смог преодолеть препятствие. И покидает полосу препятствий.");
            return false;
        }
        System.out.printf("Кот перепрыгнул препятствие высотой %d метра.\n",wall.getHeight());
        this.stamina -= wall.getHeight();
        return true;
    }

    @Override
    public boolean run(RunningTrack runningTrack) {
        if (this.stamina < runningTrack.getLength()) {
            System.out.println("Кот не смог преодолеть препятствие. И покидает полосу препятствий.");
            return false;
        }
        System.out.printf("Кот пробежал дистанцию %d метров.\n", runningTrack.getLength());
        this.stamina -= runningTrack.getLength();
        return true;

    }

}
