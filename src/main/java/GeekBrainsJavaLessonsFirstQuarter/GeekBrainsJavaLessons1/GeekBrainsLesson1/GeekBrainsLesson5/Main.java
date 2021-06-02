package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsJavaLessons1.GeekBrainsLesson1.GeekBrainsLesson5;

public class Main {

    public static void main(String[] args) {

        Employees[] employeeArray = new Employees[5];

        employeeArray[0] = new Employees(
                "Захаров",
                "Александр",
                "Владимирович",
                "Ученик GeekBrains",
                "alex.362838969@yandex.ru",
                "8-921-370-90-94",
                60000,
                35);

        employeeArray[1] = new Employees(
                "Иванов",
                "Пётр",
                "Иванович",
                "Продавец",
                "peta@yanex.ru",
                "8-904-543-45-65",
                45000,
                25);

        employeeArray[2] = new Employees("Петров", "Василий", "Петрович", "Мойщик",
                "vaca@yandex.ru", "8-995-123-45-67", 30000, 45);
        employeeArray[3] = new Employees("Сидоров", "Дмитрий", "Дмитриевич", "Грузчик",
                "dima@yandex.ru", "8-906-784-32-15", 50000, 34);
        employeeArray[4] = new Employees("Шишкин", "Василий", "Александрович", "Директор",
                "vasja@yandex.ru", "8-921-456-32-67", 80000, 65);

        System.out.println("Сотрудники старше 40 лет");
        for (Employees employees : employeeArray) {
            if (employees.age > 40) {
                employees.employeesInfo();
            }
        }
        Employees.counterInfo();
        Employees.counterZero();
        System.out.println("\nСотрудники младше 40 лет");
        for (Employees employees : employeeArray) {
            if (employees.age < 40) {
                employees.employeesInfo();
            }
        }
        Employees.counterInfo();
    }
}
