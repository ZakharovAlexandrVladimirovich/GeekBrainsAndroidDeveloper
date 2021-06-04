package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7.Food;

public class CatFood {

    private String name;
    private int weight;
    private int portion;

    public CatFood(String name, int weight, int portion) {
        this.name = name;
        this.weight = weight;
        this.portion = portion;
    }
    public  boolean catFoodInfo() {
        if (this.weight == 0) {
            System.out.printf("%s закончился.\n", this.name);
            return true;
        }
        System.out.printf("Корма осталось %d кг\n", this.weight - this.portion);
        return false;
    }
    public  void addCatFoodToPlate(Plate plate) {
        if (catFoodInfo()) {
            return;
        }
        this.weight-= this.portion;
        plate.setFood(plate.getFood() + this.portion);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }
}
