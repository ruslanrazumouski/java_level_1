package java_6_home_work;

public class Animal {
    private String name;
    private int maxLengthRun;
    private int maxLengthSwim;
    private double maxHeightJump;

    Animal(String name) {
        this.name = name;
        this.maxLengthRun = 0;
        this.maxLengthSwim = 0;
        this.maxHeightJump = 0;
    }

    Animal(String name, int maxLengthRun, int maxLengthSwim, double maxHeightJump) {
        this.name = name;
        this.maxLengthRun = maxLengthRun;
        this.maxLengthSwim = maxLengthSwim;
        this.maxHeightJump = maxHeightJump;
    }

    public String getName() {
        return name;
    }

    public void setMaxLengthRun(int maxLengthRun) {
        this.maxLengthRun = maxLengthRun;
    }

    public int getMaxLengthRun() {
        return maxLengthRun;
    }

    public void setMaxLengthSwim(int maxLengthSwim) {
        this.maxLengthSwim = maxLengthSwim;
    }

    public int getMaxLengthSwim() {
        return maxLengthSwim;
    }

    public void setMaxHeightJump(double maxHeightJump) {
        this.maxHeightJump = maxHeightJump;
    }

    public double getMaxHeightJump() {
        return maxHeightJump;
    }

    public boolean isRun(int length) {
        return ( length <= maxLengthRun ) && ( length != 0 );
    }

    public boolean isSwim(int length) {
        return ( length <= maxLengthSwim ) && ( length != 0 );
    }

    public boolean isJump(double height) {
        return ( height <= maxHeightJump ) && ( height != 0 );
    }

    public void printAbilityRun(int length) {
        if ( isRun( length ) ) {
            System.out.printf("Животное может пробежать дистанцию %d метров\n", length);
        } else {
            System.out.printf("Животное не может пробежать дистанцию %d метров\n" +
                              "(максимальная дистанция %d метров)\n", length, maxLengthRun);
        }
    }

    public void printAbilitySwim(int length) {
        if ( isSwim( length ) ) {
            System.out.printf("Животное может проплыть дистанцию %d метров\n", length);
        } else {
            System.out.printf("Животное не может проплыть дистанцию %d метров\n" +
                              "(максимальная дистанция %d метров)\n", length, maxLengthSwim);
        }
    }

    public void printAbilityJump(double height) {
        if ( isJump( height) ) {
            System.out.printf("Животное может прыгнуть на высоту %.1f метров\n", height);
        } else {
            System.out.printf("Животное не может прыгнуть на высоту %.1f метров\n" +
                              "(максимальная дистанция %.1f метров)\n", height, maxHeightJump);
        }
    }

}
