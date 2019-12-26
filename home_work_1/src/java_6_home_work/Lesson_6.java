package java_6_home_work;

import java.util.Random;

public class Lesson_6 {

    private static void drawLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("–");
        }
        System.out.println();
    }

    private static int randLength(int length) {
        Random rand = new Random();
        return rand.nextInt(length);
    }

    private static double randLength(double height) {
        Random rand = new Random();
        return rand.nextDouble() * height;
    }

    private static void printAllInfo(Animal[] animals) {
        for ( Animal animal : animals) {
            if (animal instanceof Cat) {
                ((Cat) animal).printName();
            } else if (animal instanceof Dog) {
                ((Dog) animal).printName();
            } else {
                System.out.println( animal.getName() );
            }
            animal.printAbilitySwim( animal.getMaxLengthSwim() );
            animal.printAbilityRun( randLength( animal.getMaxLengthRun() * 5 ) ); // 5 - выход за пределы
            animal.printAbilityJump( randLength( animal.getMaxHeightJump() ) );
            drawLine(50);
        }
    }

    private static Animal[] initAnimal(String[] names) {
        Animal[] animal = new Animal[names.length];
        for (int i = 0; i < names.length; i++) {
            animal[i] = new Animal( names[i] );
        }
        return animal;
    }

    public static void main(String[] args) {
        String[] dogNames = {"Шарик", "Жучка", "Барбос", "Каштанка"};
        String[] catNames = {"Пушок", "Барсик", "Мурзик", "Рыжик", "Снежок"};

        // коты
        Cat[] cats = new Cat[catNames.length];
        for (int i = 0; i < catNames.length; i++) {
          cats[i] = new Cat( catNames[i] );
        }

        //собаки
        Dog[] dogs = new Dog[dogNames.length];
        for (int i = 0; i < dogNames.length; i++) {
            dogs[i] = new Dog( dogNames[i] );
        }

        printAllInfo(cats);
        printAllInfo(dogs);

    }
}
