package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson3;

import java.util.Random;
import java.util.Scanner;

class GeekBrainsLesson3 {
    public static Random random = new Random();
    public static final Scanner scanner = new Scanner(System.in);

    public static int endGame() {

        System.out.println("\nПримите решение:");
        System.out.println("0. Выйти в главное меню.");
        System.out.println("1. Продолжить игру.");

        return not_A_Number();
    }

    public static void guessTheNumber() {
        do {
            int gamesSuper = 110;
            for (int game1 = 10; ; game1 += 10) {

                if (game1 != gamesSuper) {
                    System.out.printf("Уровень № %d. Угадайте число от 0 до %d.\n", game1 / 10, game1);
                    if (guessTheNumberGameplay(random.nextInt(game1 + 1), 7)) {
                        break;
                    }
                } else {
                    guessTheNumberSuperGame();
                    gamesSuper += 100;
                }
            }
        } while (endGame() > 0);
    }

    public static void guessTheNumberSuperGame() {

        do {
            System.out.println("   Super Game!!! Super Game!!! Super Game!!!");
            System.out.println("\nЧИСЛОМ ПОПЫТОК И ДИАПОЗОНОМ ВЫ УПРАВЛЯЕТЕ САМИ.\n");
            System.out.println("Попробуй угадать число которое я загадаю !!!");

            System.out.println("От какого числа будем загадывать?");
            int start = not_A_Number();
            System.out.println("До какого числа будем загадывать?");
            int finish = not_A_Number();
            int pcNumber = random.nextInt((Math.max(start, finish) - Math.min(start, finish)) + 1)
                    + Math.min(start, finish);

            System.out.println("Подумайте хорошо, я загадываю сложные числа ))).");
            System.out.println("Введите количество попыток.");
            int maxTryCount = not_A_Number();

            System.out.println("       И так, начнем!!!");
            System.out.printf(" Я выбрал число от %d до %d\n", Math.min(start, finish), Math.max(start, finish));
            System.out.println("    Какое число я загадал?");

            guessTheNumberGameplay(pcNumber, maxTryCount);
        } while (endGame() > 0);


    }

    public static boolean guessTheNumberGameplay(int pcNumber, int maxTryCount) {

        System.out.println("          У вас  " + maxTryCount + "  попыток!!!");
        System.out.println("Попытка № 1");
        int[] arraysNumbersEnter = new int[maxTryCount];

        while (--maxTryCount >= 0) {
            int myAnswer = not_A_Number();

            if (maxTryCount == 0) {
                System.out.println("\n\nК сожалению Ваши попытки закончились!!!");
                System.out.println("  Не расстраивайтесь и начните заново.\n\n");
//                System.exit(0);
                return true;

            }
            if (myAnswer == pcNumber) {
                System.out.printf("%25d = %d\n", myAnswer, pcNumber);
                System.out.print("         Невероятно, вы угадали моё число!!! ");

                if (maxTryCount + 1 == (arraysNumbersEnter.length)) {
                    System.out.println("С 1 попытки !!!");
                    System.out.println("Как вам это удалось?");
                    System.out.println("В следующий раз загадаю число по сложнее.");
                }
                System.out.println("\n         --------Вы прошли уровень.---------");
                return false;
            }
            if (maxTryCount < 2) {
                System.out.println("Напряги извилины или тебе не видить секретного уровня!!!");
            } else if (maxTryCount < 5) {
                System.out.println("\nАккуратнее с выбором или удачи тебе не видать.");
            }
            if (myAnswer < pcNumber) {
                System.out.printf("%d < ???    ВВЕДИТЕ ЧИСЛО ПОБОЛЬШЕ.\n", myAnswer);
            } else {
                System.out.printf("??? < %d   ВВЕДИТЕ ЧИСЛО ПОМЕНЬШЕ.\n", myAnswer);
            }
            System.out.printf("    Осталось  %d  попыток!!!\n", maxTryCount);
            int indexMassive = (arraysNumbersEnter.length - maxTryCount - 1);
            arraysNumbersEnter[indexMassive] = myAnswer;

            System.out.print("Введеные числа:");
            for (int i = 0; i <= indexMassive; i++) {
                System.out.printf("[%d] ", arraysNumbersEnter[i]);
            }
            System.out.printf("\nПопытка № %d\n", (indexMassive + 2));

        }
        return false;
    }

    public static int not_A_Number() {

        while (!scanner.hasNextInt()) {
            System.out.println("Вводите цифры:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static void guessTheWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato", "cat", "dog", "home"};
        do {
            System.out.println("\nОтличный выбор. Тут все очень просто.");
            System.out.println("Я загадываю слово, а ты пробуешь его отгадать.");
            System.out.println("Кстати я его уже загадал, но сначала...\n");
            System.out.println("Введи количество слов в одной строке подсказок.");
            guessTheWordGameplay(words[random.nextInt(words.length - 1)], words, numberWords());
        } while (endGame() != 0);
    }

    public static void guessTheWordGameplay(String pcWord, String[] words, int numberWords) {

        scanner.nextLine();
        do {
            StringBuilder answer = new StringBuilder();

            numberOfWordsPerLine(words, numberWords);
            System.out.println("\nВведите ответ:");
            String useAnswer = scanner.nextLine().toLowerCase();
            for (int i = 0; i < Math.min(pcWord.length(), useAnswer.length()); i++) {

                if (useAnswer.equals(pcWord)) {
                    System.out.println(answer + "  Правильно!!! Ты отгадал моё загаданное слово.");
                    return;
                }
                if (useAnswer.charAt(i) == pcWord.charAt(i)) {
                    answer.append(useAnswer.charAt(i));
                    System.out.println("Есть совпадения. Ты уже близок к разгадке!!!");
                } else {
                    answer.append('#');
                }
            }
            System.out.format("%s###############  Попробуй другое слово!!!\n\n", answer);
        } while (true);
    }

    public static int numberWords() {

        do {
            if (scanner.hasNextInt()) {
                int numberWords = scanner.nextInt();
                if (numberWords < 1) {
                    System.out.println("Введите цифру больше НУЛЯ");
                } else {
                    return numberWords;
                }
            } else {
                System.out.println("Можно вводить только цифры");
                scanner.next();
            }
        } while (true);
    }

    public static void numberOfWordsPerLine(String[] words, int numberWords) {

        for (int i = 1; i <= words.length; i++) {

            System.out.printf("%-11S", words[i - 1]);
            if (i % numberWords == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        do {  //region  Игровое Меню
            System.out.printf("\nHi %s!!! Давай во что нибудь сыграем:\n", name);
            System.out.println("Выбирай во что будем играть.\n");
            System.out.println("0. Exit the app.");
            System.out.println("1. Guess the number.");
            System.out.println("2. Guess the number of the Super Game.");
            System.out.println("3. Guess the word.");
            //endregion

            switch (not_A_Number()) {
                case 0 -> {
                    System.out.println("Очень жаль :(");
                    System.exit(0);
                }
                case 1 -> guessTheNumber();
                case 2 -> guessTheNumberSuperGame();
                case 3 -> guessTheWord();
            }
        } while (true);
    }
}
