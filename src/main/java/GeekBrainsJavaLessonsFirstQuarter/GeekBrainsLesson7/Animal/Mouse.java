package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7.Animal;

public class Mouse extends Animal {

    public Mouse(String name, int appetite, int satiety) {
        super(name, appetite, satiety);
    }

    @Override
    public void HuntsInfo() {
        System.out.printf("%s проголодался убегая. %1$s съел бы ещё: %d кг.\n", this.name, this.satiety);
    }

    public void newMouse() {
        setSatiety(random.nextInt(6) + 5);
    }
}
