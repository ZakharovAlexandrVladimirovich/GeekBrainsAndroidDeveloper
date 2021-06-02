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
