package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_7.Animal;

import GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_7.Food.Plate;

import java.util.Random;

public abstract class Animal {
    protected Random random = new Random();
    protected String name;
    protected int appetite;
    protected int satiety;

    public Animal(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public boolean satietyTest() {

        if (this.satiety > 0) {
            System.out.printf("%s хочет есть.\n", this.name);
            return false;
        }
        System.out.printf("%s больше не хочет есть.\n", this.name);
        return this.satiety == 0;
    }

    public void eat(Plate plate) {
        if (satietyTest()) {
            return;
        } else if (plate.getFood() < this.appetite) {
            System.out.printf("В тарелке не хватает еды для %s. %1$s отказывается это есть.\n", this.name);
            return;
        }
        System.out.printf("%s поела.\n", this.name);
        this.satiety -= this.appetite;
        plate.setFood(plate.getFood() - this.appetite);
        System.out.printf("В %s осталось %d кг еды.\n", plate.getName(), plate.getFood());

    }
    public void Info() {
        System.out.printf("%s съедает за раз %d кг еды. %1$s съел бы ещё: %d кг.\n", this.name, this.appetite, this.satiety);
    }
    public abstract void HuntsInfo();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

}
