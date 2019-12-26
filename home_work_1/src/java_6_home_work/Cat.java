package java_6_home_work;


public class Cat extends Animal {

    Cat(String name) {
        super(name);
        super.setMaxLengthRun(200);
        super.setMaxLengthSwim(0);
        super.setMaxHeightJump(2.0);
    }

    Cat(String name, int maxLengthRun, int maxLengthSwim, double maxHeightJump) {
        super(name, maxLengthRun, 0, maxHeightJump );
    }

    public void printName() {
        System.out.printf("Кот \"%s\"\n", super.getName() );
    }

    @Override
    public boolean isSwim(int length) {
        return false;
    }

    @Override
    public void printAbilitySwim(int length) {
        System.out.println("Коты не плавают");
    }


}
