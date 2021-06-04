package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Participant;

import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Barrier.Actions;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Barrier.RunningTrack;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Barrier.Wall;

public class Cat implements Actions {

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
        System.out.println("Кот перепрыгнул препятствие");
        this.stamina -= wall.getHeight();
        return true;
    }

    @Override
    public boolean run(RunningTrack runningTrack) {
        if (this.stamina < runningTrack.getLength()) {
            System.out.println("Кот не смог преодолеть препятствие. И покидает полосу препятствий.");
            return false;
        }
        System.out.println("Кот пробежал дистанцию");
        this.stamina -= runningTrack.getLength();
        return true;

    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
