package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7.Animal;

public class Cat extends Animal {

    public Cat(String name, int appetite, int satiety) {
        super(name, appetite, satiety);
    }

    public void HuntsInfo() {
        System.out.printf("%s проголодался гоняясь за мышкой. %1$s съел бы ещё: %d кг.\n", this.name, this.satiety);
    }

    public void hunts(Mouse mouse) {

        if (this.satiety < 20) {
            this.satiety++;
            mouse.setSatiety(mouse.getSatiety() - 1);
            if (mouse.getSatiety() == 0) {
                System.out.printf("%s поймал мышку %s.\n", this.name, mouse.getName());
                mouse.newMouse();
                return;
            }
            System.out.printf("%s не удалось поймать мышку %s.\n", this.name, mouse.getName());
            return;
        }
        System.out.printf("%s отказывается ловить мышей на голодный желудок.\n", this.name);
    }

}
