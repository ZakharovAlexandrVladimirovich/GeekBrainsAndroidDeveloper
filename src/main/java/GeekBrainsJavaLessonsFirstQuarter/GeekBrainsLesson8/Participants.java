package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson8;

public class Participants implements Actions {

   protected String name;
   protected int stamina;


    protected  Participants(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    @Override
    public void jum() {
        System.out.println("Участник подпрыгнул");
    }

    @Override
    public void run() {
        System.out.println("Участник бежит");
    }


    public class Cat{


    }
    public class Human{

    }
    public class Robot{

    }
}
