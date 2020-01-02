package java_7_home_work;

public class Cat {
    private String name;
    private int appetite;
    private boolean catWantEat;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.catWantEat = true;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isWantEat() {
        return catWantEat;
    }

    public void eatFrom(Plate plate) {
        if ( plate.isEnoughFood(appetite) && isWantEat() ) {
            plate.decreaseCapacity(appetite);
            catWantEat = false;
        } else {
            catWantEat = true;
            System.out.printf("В тарелке не достаточно еды для кота \"%s\"\n", name);
        }
    }

    public void catEatInfo() {
        if ( isWantEat() ) {
            System.out.printf("Кот \"%s\" – голодный\n", name);
        } else {
            System.out.printf("Кот \"%s\" – сыт\n", name);
        }
    }
}
