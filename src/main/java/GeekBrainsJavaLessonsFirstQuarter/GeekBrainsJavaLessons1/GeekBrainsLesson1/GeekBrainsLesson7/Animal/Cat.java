package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsJavaLessons1.GeekBrainsLesson1.GeekBrainsLesson7.Animal;

public class Cat extends Animal {

    public Cat(String name, int appetite, int satiety) {
        super(name, appetite, satiety);
    }


    public void HuntsInfo(){
        System.out.printf("%s проголодался гоняясь за мышкой. %1$s съел бы ещё: %d кг.\n", this.name, this.satiety);
    }



}
