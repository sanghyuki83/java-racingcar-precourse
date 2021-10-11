package racinggame;

public class Car {
    private final String name;
    private int moved;

    public Car(String name) {
        this.name = name;
        this.moved = 0;
    }

    public String getName() {
        return this.name;
    }

    public void go(int no) {
        if (no > 3)
            this.moved++;
    }

    public int getDistance() {
        return this.moved;
    }
}
