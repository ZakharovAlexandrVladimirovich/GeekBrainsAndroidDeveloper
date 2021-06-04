package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Participant;

import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Barrier.RunningTrack;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8.Barrier.Wall;

public class Robot implements Actions {

    protected int stamina;

    public Robot(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public boolean jum(Wall wall) {
        if (this.stamina < wall.getHeight()) {
            System.out.println("Робот не смог преодолеть препятствие. И покидает полосу препятствий.");
            return false;
        }
        System.out.println("Робот перепрыгнул препятствие");
        this.stamina -= wall.getHeight();
        return true;
    }

    @Override
    public boolean run(RunningTrack runningTrack) {
        if (this.stamina < runningTrack.getLength()) {
            System.out.println("Робот не смог преодолеть препятствие. И покидает полосу препятствий.");
            return false;
        }
        System.out.println("Робот пробежал дистанцию");
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