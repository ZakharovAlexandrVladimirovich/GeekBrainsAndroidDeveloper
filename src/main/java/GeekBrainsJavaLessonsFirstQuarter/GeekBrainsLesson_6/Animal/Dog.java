package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_6.Animal;

public class Dog extends Animals {

    private float swimming;


    public Dog(String name, String color, int age, float run, float jump, float swimming) {
        super(name, color, age, run, jump);
        setSwimming(swimming);
    }


    @Override
    public void setRun(float run) {
        if (run > 500) {
            System.err.println("Собаки не могут пробегать больше 500 метров");
            super.run = 500;
            return;
        }
        super.run = run;
    }

    public float getSwimming() {
        return swimming;
    }

    public void setSwimming(float swimming) {
        if (swimming > 10) {
            System.err.println("Собаки не могут проплыть больше 10 метров");
            this.swimming=swimming;
            return;
        }
        this.swimming = swimming;
    }

    @Override
    public void voice() {
        System.out.printf(ANSI_YELLOW + "Собака %s гафкнула:\n" + ANSI_RESET, getName());
    }


}
