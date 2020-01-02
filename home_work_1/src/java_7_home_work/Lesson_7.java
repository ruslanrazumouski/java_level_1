package java_7_home_work;

public class Lesson_7 {

    private static void drawLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("–");
        }
        System.out.println();
    }

    private static void printInfoAboutCats(Cat[] cats, Plate plate) {
        for ( Cat cat : cats) {
            cat.eatFrom(plate);
            cat.catEatInfo();
            if ( !cat.isWantEat() ) {
                System.out.printf("Кот скушал: %d\n", cat.getAppetite());
            }
            drawLine(50);
        }
    }

    public static void main(String[] args) {

        int appetite = 300;
        int capacity = 1000;

        String[] catNames = {"Пушок", "Барсик", "Мурзик", "Рыжик", "Снежок"};
        Plate plate = new Plate( capacity );

        // коты
        Cat[] cats = new Cat[catNames.length];
        for (int i = 0; i < catNames.length; i++) {
            cats[i] = new Cat( catNames[i], appetite);
        }

        plate.infoAboutPlate();
        plate.increaseCapacity(200);
        System.out.println("Добавили корма:");
        plate.infoAboutPlate();

        System.out.println();

        printInfoAboutCats( cats, plate );
        plate.infoAboutPlate();
    }
}
