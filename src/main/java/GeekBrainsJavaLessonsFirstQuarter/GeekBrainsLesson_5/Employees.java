package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_5;

class Employees {

    //    Домашнее задание
//⦁	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        ⦁	Конструктор класса должен заполнять эти поля при создании объекта.
//        ⦁	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        ⦁	Создать массив из 5 сотрудников.
//        Пример:
//        Person[] peersArray = new Person[5]; // Вначале объявляем массив объектов
//        peersArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        peersArray[1] = new Person(...);
//        ...
//        peersArray[4] = new Person(...);
//        ⦁	С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

    String surname;
    String name;
    String patronymic;
    String post;
    String email;
    String telephone;
    int salary;
    int age;
    private static int counter = 0;

    public Employees(String surname, String name, String patronymic, String post, String email,
                     String telephone, int salary, int age) {

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    public void employeesInfo() {

        System.out.printf("Employees %d: surname: %-10s\t name: %-10s\t patronymic: %-13s\t post: %-18s\t email: %-25s\t " +
                "telephone: %s\t\t salary: %s\t age: %-13d\n", ++counter, surname, name, patronymic, post, email, telephone, salary, age);
    }

    public static void counterInfo() {
        System.out.printf("Всего сотрудников: %d\n", counter);
    }

    public static void counterZero() {
        counter = 0;
    }

}


