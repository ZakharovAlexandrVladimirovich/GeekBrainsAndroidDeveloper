package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Participant;

import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Barrier.RunningTrack;
import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_8.Barrier.Wall;

public interface Actions {

    boolean jum(Wall wall);

    boolean run(RunningTrack runningTrack);
}
