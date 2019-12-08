package java_1_home_work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int HI = 100;
        final int LO = 0;

        float g = 6.004F;
        double k = 3.33333333D;

        char key = 'h';
        String str = "hello";

        byte bY = 27;
        short sH = 200;
        int tops = 2000000;
        int z = 0b0000_1101;
        int w = 0x33;
        long sal = 333_445_544_343L;

        boolean bool = true;

        boolean _gameOver = false;
        boolean gameOver = false;
        boolean $gameOver = false;

        // вычисляем выражение по формуле a * (b + (c / d)) и выводим
        float a, b, c, d;
        a = 3;
        b = 4;
        c = 1;
        d = 3;
        System.out.printf("%.2f * (%.2f + (%.2f / %.2f)) = ", a, b, c, d);
        System.out.println(calc(a, b, c, d));

        // проверка вхождения суммы двух чисел в диапазон от 10 до 20 (включительно)
        int num1, num2;
        num1 = 3;
        num2 = 4;
        if (sumInRange(num1, num2)) {
            System.out.printf("Сумма чисел %d + %d = %d лежит в диапазоне от 10 до 20\n", num1, num2, num1 + num2);
        } else {
            System.out.printf("Сумма чисел %d + %d = %d не лежит в диапазоне от 10 до 20\n", num1, num2, num1 + num2);
        }

        // печатаем какое число передали в качестве параметра: положительное или отрицательное
        printPositiveOrNegative(-3);
        printPositiveOrNegative(0);
        printPositiveOrNegative(12);

        // определяем какое передали число в метод, если отрицательное - true
        num1 = -1;
        if ( isNegative(num1) ) {
            System.out.printf("Число %d - отрицательное\n", num1);
        } else {
            System.out.printf("Число %d - положительное\n", num1);
        }

        // выводим имя
        printHello("Руслан");

        // определение високосного года
        System.out.print("Введите год (в формате YYYY): ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        getYear(year);

    }

    private static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean sumInRange(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20) ? true : false;
    }

    private static void printPositiveOrNegative(int a) {
        String answer = (a >= 0) ? "положительное" : "отрицательное";
        System.out.println("Пользователь ввел " + answer + " число = " + a);
    }

    private static boolean isNegative(int a) {
        return (a < 0) ? true : false;
    }

    private static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static void getYear(int year) {
        if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ) {
            System.out.println("Год " +year+ " високосный!");
        } else {
            System.out.println("Год " +year+ " не високосный!");
        }
    }
}