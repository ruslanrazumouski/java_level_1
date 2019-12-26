package java_6_home_work;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
        super.setMaxLengthRun(500);
        super.setMaxLengthSwim(10);
        super.setMaxHeightJump(0.5);
    }

    Dog(String name, int maxLengthRun, int maxLengthSwim, double maxHeightJump) {
        super(name, maxLengthRun, maxLengthSwim, maxHeightJump );
    }

    public void printName() {
        System.out.printf("Собака \"%s\"\n", super.getName() );
    }
}
