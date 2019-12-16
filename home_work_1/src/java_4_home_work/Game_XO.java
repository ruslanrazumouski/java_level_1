package java_4_home_work;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class Game_XO {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';

    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void initField() {
        map = new char[SIZE][SIZE];
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printField() {
        for (int i=0; i<=SIZE; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();
        for (int i=0; i<SIZE; i++) {
            System.out.print((i+1) + " | ");
            for (int j=0; j<SIZE; j++) {
                System.out.print(map[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) {
        if  (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void humanStep() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiStep() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        int i, j;
        int countSymbInRow = 0,
            countSymbInCol = 0,
            countSymbInDiag1 = 0,
            countSymbInDiag2 = 0;

        // проверка по строкам и столбцам и двум диагоналям
        for (i = 0; i < SIZE; i++) {
            for (j = 0; j < SIZE; j++) {
                if ( map[i][j] == symb ) countSymbInRow++;
                if ( map[j][i] == symb ) countSymbInCol++;
                if ( map[j][j] == symb ) countSymbInDiag1++;
                if ( map[SIZE-1-j][j] == symb ) countSymbInDiag2++;
                if ( countSymbInRow == DOTS_TO_WIN || countSymbInCol == DOTS_TO_WIN ||
                     countSymbInDiag1 == DOTS_TO_WIN || countSymbInDiag2 == DOTS_TO_WIN ) {
                    return true;
                }
            }
            countSymbInRow = 0;
            countSymbInCol = 0;
            countSymbInDiag1 = 0;
            countSymbInDiag2 = 0;
        }
        return false;
    }

    public static boolean isFieldFull () {
        for (int i = 0 ; i < SIZE ; i++) {
            for (int j = 0 ; j < SIZE ; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            humanStep();
            printField();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            aiStep();
            printField();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искусственный Интеллект");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}
