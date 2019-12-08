package java_2_home_work;

public class Main {

    private static int reverseElem(int x) {
        return (x == 1 ? 0 : 1);
    }

    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void fillArrayRandomElem(int[] array) {
        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    private static int minElemOfArray(int[] array) {
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    private static int maxElemOfArray(int[] array) {
        int max = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int indexMaxElemOfArray(int[] array) {
        int max = array[0];
        int ind = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i]>max) {
                max = array[i];
                ind = i;
            }
        }
        return ind;
    }

    private static boolean checkBalance(int[] array) {
        int sum1 = 0, sum2 = 0;
        int index = indexMaxElemOfArray(array);
        for (int i = 0; i < array.length; i++) {
            if (index < array.length / 2) {
                if (i <= index) {
                    sum1 += array[i];
                } else {
                    sum2 += array[i];
                }
            } else {
                if (i < index) {
                    sum1 += array[i];
                } else {
                    sum2 += array[i];
                }
            }
        }
        return sum1 == sum2;
    }

    private static void shiftOnOneElemRight(int[] array) {
        int curElem = array[0];
        int nextElem;
        for (int i=0; i<array.length-1; i++) {
            nextElem = array[i+1];
            array[i+1] = curElem;
            curElem = nextElem;
        }
        array[0] = curElem;
    }

    private static void shiftOnOneElemLeft(int[] array) {
        int curElem = array[array.length-1];
        int prevElem;
        for (int i=array.length-1; i>0; i--) {
            prevElem = array[i-1];
            array[i-1] = curElem;
            curElem = prevElem;
        }
        array[array.length-1] = curElem;
    }

    private static void shiftArray(int[] array, int n) {
        for (int i = 1; i <= Math.abs(n); i++) {
            if (n>0) {
                shiftOnOneElemRight(array);
            } else {
                shiftOnOneElemLeft(array);
            }
        }
    }

    public static void main(String[] args) {

        // Задача 1.
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Задание 1.");
        System.out.println("Исходный массив:");
        printArray(array);

        for (int i=0; i<array.length; i++) {
            array[i] = reverseElem(array[i]);
        }

        System.out.println("Массив-результат:");
        printArray(array);
        System.out.println();

        // Задача 2.
        int k=0;
        int[] array2 = new int[8];
        for (int i=0; i<array2.length; i++) {
            array2[i] = k;
            k += 3;
        }

        System.out.println("Задание 2.");
        System.out.println("Массив-результат:");
        printArray(array2);
        System.out.println();

        // Задача 3.
        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println("Задание 3.");
        System.out.println("Исходный массив:");
        printArray(array3);

        for (int i=0; i<array3.length; i++) {
            if ( array3[i] < 6 ) {
                array3[i] *= 2;
            }
        }

        System.out.println("Массив-результат:");
        printArray(array3);
        System.out.println();

        // Задача 4.
        System.out.println("Задание 4.");
        System.out.println("Исходный массив 5x5:");

        int[][] array4 = new int [5][5];
        for (int i=0; i<array4.length; i++) {
            for (int j=0; j<array4.length; j++) {
                array4[i][j] = 0;
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Массив-результат (диагонали - единицы):");
        for (int i=0; i<array4.length; i++) {
            for (int j=0; j<array4.length; j++) {
                if ( i==j || j==array4.length-1-i ) {
                    array4[i][j] = 1;
                }
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Задача 5.
        System.out.println("Задание 5.");
        System.out.println("Исходный массив:");

        int[] array5 = new int[10];
        fillArrayRandomElem(array5);
        printArray(array5);

        System.out.println("Минимальный элемент: " + minElemOfArray(array5));
        System.out.println("Максимальный элемент: " + maxElemOfArray(array5));
        System.out.println();

        // Задача 6.
        System.out.println("Задание 6.");
        System.out.println("Исходный массив:");
        int[] array6 = { 3, 5, 3, 8, 3 };
        printArray(array6);

        if ( checkBalance(array6) ) {
            System.out.println("В массиве есть место в котором сумма левой и правой части равны");
        } else {
            System.out.println("В массиве нет места в котором сумма левой и правой части равны");
        }
        System.out.println();

        // Задача 7.
        int[] array7 = { 1, 2, 3, 4, 5 };

        System.out.println("Задание 7.");
        System.out.println("Исходный массив:");
        printArray(array7);

        int n = 2;
        shiftArray(array7, n);
        System.out.println("Массив после " + n + " смещений:");
        printArray(array7);
    }
}
