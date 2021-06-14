package GeekBrainsJavaLessonsFirstQuarter.GeekBrainsLesson_4;

import java.util.Random;
import java.util.Scanner;

public class GeekBrainsLesson4 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static int notNumber() {
        while (!scanner.hasNextInt()) {
            System.out.println("Вводите цифры:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }


    public static int sizeMap;
    public static int winLine;
    public static int x;
    public static int y;
    public static final char fieldLabel = '-';
    public static final char playerLabel = 'X';
    public static final char pcLabel = 'O';
    public static char[][] arraysMap;

    //region Распечатка поля
    public static void initMap() {
        arraysMap = new char[sizeMap][sizeMap];
        for (int i = 0; i < sizeMap; i++) {
            for (int j = 0; j < sizeMap; j++) {
                arraysMap[i][j] = (fieldLabel);
            }


        }
        System.out.println();
    }

    public static void printMap() {
        for (int i = 0; i < sizeMap + 1; i++) {
            System.out.print(i + "    ");
        }
        for (int i = 0; i < sizeMap; i++) {
            System.out.println("\n");
            System.out.print(1 + i + "    ");
            for (int j = 0; j < sizeMap; j++) {
                System.out.print((arraysMap[i][j]) + "    ");
            }
        }
    }

    //endregion
    public static boolean checkingTheCoordinate(int x, int y) {

        if (y < 0 || y >= sizeMap || x < 0 || x >= sizeMap) {
            System.err.println("Такой координаты нету или ячейка уже занята");
            return true;
        }
        return arraysMap[x][y] != fieldLabel;
    }

    public static void playerTurn() {

        do {
            System.out.println("\n\nВведите координату вертикального ряда:");
            x = notNumber() - 1;
            System.out.println("Введите координату горизонтального ряда:");
            y = notNumber() - 1;
        } while (checkingTheCoordinate(x, y));
        arraysMap[x][y] = playerLabel;
    }

    public static void pcTurn() {

//        if ( y+1!=sizeMap && y!=2 && arraysMap[x][y + 1] == fieldLabel) {
//            arraysMap[x][y + 1] = pcLabel;
//
//        } if ( y-1!=-1 && y!=2 && arraysMap[x][y - 2] == fieldLabel){
//            arraysMap[x][y - 1] = pcLabel;
//        }
//        else{
//            do {
//                x = random.nextInt(sizeMap);
//                y = random.nextInt(sizeMap);
//            } while (checkingTheCoordinate(x, y));
//        }
//
//        arraysMap[x][y] = pcLabel;


            if (arraysMap[sizeMap / 2][sizeMap / 2] == fieldLabel) {
                x = y = sizeMap / 2;
            } else {
                do {
                    x = random.nextInt(sizeMap);
                    y = random.nextInt(sizeMap);
                } while (checkingTheCoordinate(x, y));
            }
        arraysMap[x][y] = pcLabel;
        System.out.println("\nКомпьютер сделал хитрый ход, выбрав координату " + (x + 1) + ", " + (y + 1));
    }

    public static boolean checkingHorizontals(char winPcOrPlayer) {
        int winSum = 0;
        for (int i = 0; i < sizeMap; i++) {
            for (int k = 0; k <= sizeMap - winLine; k++) {
                for (int j = k; j < winLine + k; j++) {
                    if (arraysMap[i][j] == winPcOrPlayer) {
                        ++winSum;

//                        if (winSum == winLine - 2) {
//                            x = i;
//                            y = j;
//                        }

                    }
                }
                if (winSum == winLine) {
                    return true;
                } else {
                    winSum = 0;
                }
            }
        }
        return false;
    }

    public static boolean checkingVerticals(char winPcOrPlayer) {
        int winSum = 0;
        for (int i = 0; i < sizeMap; i++) {
            for (int k = 0; k <= sizeMap - winLine; k++) {
                for (int j = k; j < winLine + k; j++) {
                    if (arraysMap[j][i] == winPcOrPlayer) {
                        ++winSum;

//                        if (winSum == winLine - 2) {
//                            x = i;
//                            y = j;
//                        }


                    }
                }
                if (winSum == winLine) {
                    return true;
                } else {
                    winSum = 0;
                }
            }
        }
        return false;
    }

    public static boolean checkingLeftDiagonal(char winPcOrPlayer) {

        int winSum = 0;
        for (int i = winLine - 1; i < sizeMap; i++) {
            int saveI = i;
            for (int k = 0; k <= sizeMap - winLine; k++) {
                i = saveI;
                for (int j = k; j < winLine + k; i--, j++) {
                    if (arraysMap[i][j] == winPcOrPlayer) {
                        ++winSum;

//                        if (winSum == winLine - 2) {
//                            x = i;
//                            y = j;
//                        }

                    }
                }
                if (winSum == winLine) {
                    return true;
                } else {
                    winSum = 0;
                    i += winLine;
                }
            }
        }
        return false;
    }

    public static boolean checkingRightDiagonal(char winPcOrPlayer) {
        int winSum = 0;
        for (int i = 0; i <= sizeMap - winLine; i++) {
            int saveI = i;
            for (int k = 0; k <= sizeMap - winLine; k++) {
                i = saveI;
                for (int j = k; j < winLine + k; i++, j++) {
                    if (arraysMap[i][j] == winPcOrPlayer) {
                        ++winSum;

//                        if (winSum == winLine - 2) {
//                            x = i;
//                            y = j;
//                        }
                    }
                }
                if (winSum == winLine) {
                    return true;
                } else {
                    winSum = 0;
                    i -= winLine;
                }
            }
        }
        return false;
    }

    //   Рабочий код на любое поле, но только для трёх фишек.

//        for (int i = 0; i < sizeMap; i++) {
//            for (int j = 0; j < win - 2; j++) {
//                if ((arraysMap[i][j] == winPcOrUse && arraysMap[i][j + 1] == winPcOrUse && arraysMap[i][j + 2] == winPcOrUse) ||
//                        (arraysMap[j][i] == winPcOrUse && arraysMap[j + 1][i] == winPcOrUse && arraysMap[j + 2][i] == winPcOrUse)) {
//                    return true;
//                }
//            }
//        }
//        for (int i = 0; i < sizeMap - 2; i++) {
//            for (int j = 0; j < win - 2; j++) {
//                if ((arraysMap[i][j] == winPcOrUse && arraysMap[i + 1][j + 1] == winPcOrUse && arraysMap[i + 2][j + 2] == winPcOrUse) ||
//                        (arraysMap[i][j + 2] == winPcOrUse && arraysMap[i + 1][j + 1] == winPcOrUse && arraysMap[i + 2][j] == winPcOrUse)) {
//                    return true;
//                }
//            }
//        }

    public static boolean drawnGame() {
        for (int i = 0; i < sizeMap; i++) {
            for (int j = 0; j < sizeMap; j++) {
                if (arraysMap[i][j] == fieldLabel) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Введите размер поля:");
        sizeMap = notNumber();
        System.out.println("Введите длинну победной линии:");

        do {
            System.err.println("Победная линия не может быть больше размера поля!!!");
            winLine = notNumber();
            scanner.nextLine();

        } while (winLine > sizeMap);

        initMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (checkingHorizontals(playerLabel) ||
                    checkingVerticals(playerLabel) ||
                    checkingLeftDiagonal(playerLabel) ||
                    checkingRightDiagonal(playerLabel)
            ) {
                System.out.println("\nПобедил Игрок.");
                break;
            }
            if (drawnGame()) {
                System.out.println("\n\nЭх...Пустая трата времени. Ничья!!!");
                break;
            }
            pcTurn();
            printMap();
            if (checkingHorizontals(pcLabel) ||
                    checkingVerticals(pcLabel) ||
                    checkingLeftDiagonal(pcLabel) ||
                    checkingRightDiagonal(pcLabel)
            ) {
                System.out.println("\nПобедил компьютер.");
                break;
            }
            if (drawnGame()) {
                System.out.println("\n\nЭх...Пустая трата времени. Ничья!!!");
                break;
            }
        }
    }
}





