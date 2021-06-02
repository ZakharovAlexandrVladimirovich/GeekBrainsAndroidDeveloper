package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson7.Food;

public class Plate {
    private String name;
    private int food;

    public Plate(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public void getFoodTest() {

        if (this.food == 0) {
            System.out.printf("Еда в %s закончилась.\n", this.name);
            return;
        }
        System.out.printf(" В тарелке осталось %d кг еды\n", this.food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFood() {
        return food;
//        System.out.printf("В тарелке %d кг еды.\n", this.food);
    }

    public void setFood(int food) {
        if (this.food < 1) {
            System.out.println("В тарелке недостаточно еды");
            this.food = 0;
        }
        this.food = food;
    }
}
