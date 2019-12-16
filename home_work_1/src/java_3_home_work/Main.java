package java_3_home_work;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static String[] words =
            {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    private static String randomWord(String[] array) {
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        return array[index];
    }

    public static void main(String[] args) {

        final int N = 15;
        String answer;
        String word = randomWord(words);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Отгадайте загаданное слово");
            System.out.println("[ Выход из игры \"q\" ]");
            System.out.println("Введите слово: ");

            answer = scanner.nextLine();
            answer = answer.toLowerCase();
            if ( answer.equals("q") ) {
                System.out.println("Вы прервали игру");
                break;
            } else if ( answer.equals(word) ) {
                System.out.println("Вы угадали слово. Загаданное слово - " + word);
            } else {
                System.out.println("Вы не угадали загаданное слово");
                for (int i = 0; i < N; i++) {
                    if ( i < answer.length() && i < word.length() && answer.charAt(i) == word.charAt(i) ) {
                        System.out.print(answer.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
            System.out.println();
        } while ( !answer.equals(word) );

        System.out.println("Игра завершена");
        scanner.close();
    }
}
