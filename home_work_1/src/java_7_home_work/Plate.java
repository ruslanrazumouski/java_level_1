package java_7_home_work;

public class Plate {
    private int capacity;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void infoAboutPlate() {
        if ( isEmptyPlate() ) {
            System.out.println("Наполните тарелку");
        } else {
            System.out.println("В тарелке: " + capacity);
        }
    }

    public void decreaseCapacity(int capacity) {
        if ( isEnoughFood(capacity) ) {
            this.capacity -= capacity;
        }
    }

    public void increaseCapacity(int capacity) {
        this.capacity += capacity;
    }

    public boolean isEnoughFood(int capacity) {
        return ( ( this.capacity - capacity ) >= 0 );
    }

    public boolean isEmptyPlate() {
        return ( this.capacity <= 0 );
    }
}
