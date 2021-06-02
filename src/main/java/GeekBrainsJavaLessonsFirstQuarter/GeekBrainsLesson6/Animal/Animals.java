package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson6.Animal;

public abstract class Animals {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    

    protected String name;
    protected String color;
    protected int age;
    protected float run;
    protected float jump;
    public static int counter = 0;

    public Animals(String name, String color, int age, float run, float jump) {
        this.name = name;
        this.color = color;
        setAge(age);
        this.run = run;
        this.jump = jump;
        ++counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return;
        }
        System.err.println("Возраст не может быть отрицательным");
    }

    public float getRun() {
        return run;
    }

    public abstract void setRun(float run);

    public float getJump() {
        return jump;
    }

    public void setJump(float jump) {
        this.jump = jump;
    }

    public abstract float getSwimming();

    public abstract void voice();

    public void animalInfo() {

        System.out.printf("Animals:\tname: %-8s\t color: %-11s\t age: %-2d лет\t run: %.1f м\t jump: %.1f м\t swimming: %.1f м\n",
                this.name, this.color, this.age, this.run, this.jump, getSwimming());
    }


    public void runTest(float distance) {
        if (run < distance) {
            System.out.printf("Животное %s не смогло пробежать такое расстояние. %1$s очень устал.\n", this.name);
            return;
        }
        if (run == distance) {
            System.out.printf("Животное %s пробежало максимальную дистанцию. %1$s устал.\n", this.name);
        }
        if (run > distance) {
            System.out.printf("Животное %s пробежало %.1f метров.%1$s не устал и готов бежать дальше.\n", this.name, distance);
        }
    }

    public void jumpTest(float distance) {
        if (jump < distance) {
            System.out.printf("Животное %s не смогло подпрыгнуть на такую высоту. %1$s очень устал.\n", this.name);
            return;
        }
        if (jump == distance) {
            System.out.printf("Животное %s подпрыгнуло на максимальную высоту. %1$s устал.\n", this.name);
        }
        if (jump > distance) {
            System.out.printf("Животное %s подпрыгнуло на %.1f метров. %1$s готов прыгать ещё.\n", this.name, distance);
        }
    }

    public void swimmingTest(float distance) {

        if (getSwimming() == 0) {
            System.out.printf("Животное %s не умеет плавать!\n", this.name);
            return;
        }
        if (getSwimming() < distance) {
            System.out.printf("Животное %s не смогло проплыть такое расстояние. %1$s очень устал.\n", this.name);
            return;
        }
        if (getSwimming() == distance) {
            System.out.printf("Животное %s проплыло максимальное расстояние. %1$s устал.\n", this.name);
        }
        if (getSwimming() > distance) {
            System.out.printf("Животное %s проплыло %.1f метров. %1$s готов плыть дальше.\n", this.name, distance);
        }


    }

    public void animalEndurance() {
        voice();
        animalInfo();
    }
}
