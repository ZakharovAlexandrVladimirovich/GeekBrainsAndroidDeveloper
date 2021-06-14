package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Participant;

import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Barrier.RunningTrack;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Barrier.Wall;

public class Human implements Actions {

    protected int stamina;

    public Human(int stamina) {

        this.stamina = stamina;
    }

    @Override
    public boolean jum(Wall wall) {
        if (this.stamina < wall.getHeight()) {
            System.out.println("Человек не смог преодолеть препятствие. И покидает полосу препятствий.");
            return false;
        }
        System.out.printf("Человек перепрыгнул препятствие высотой %d метра.\n",wall.getHeight());
        this.stamina -= wall.getHeight();
        return true;
    }

    @Override
    public boolean run(RunningTrack runningTrack) {
        if (this.stamina < runningTrack.getLength()) {
            System.out.println("Человек не смог преодолеть препятствие. И покидает полосу препятствий.");
            return false;
        }
        System.out.printf("Человек пробежал дистанцию %d метров.\n", runningTrack.getLength());
        this.stamina -= runningTrack.getLength();
        return true;
    }
}
