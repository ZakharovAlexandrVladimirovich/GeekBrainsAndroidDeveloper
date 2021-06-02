package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson6.Animal;

public class Cat extends Animals {


    public Cat(String name, String color, int age, float run, float jump) {
        super(name, color, age, run, jump);
    }

    @Override
    public void setRun(float run) {
        if (run > 200) {
            System.err.println("Коты не могут пробегать больше 200 метров");
            this.run = 200;
            return;
        }
        super.run = run;
    }

    @Override
    public float getSwimming() {
        return 0;
    }

    @Override
    public void voice() {
        System.out.printf(ANSI_YELLOW + "Ко(т)(шка) %s мяукнул(а)\n" + ANSI_RESET, getName());
    }


}
