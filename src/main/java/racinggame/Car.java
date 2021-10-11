package racinggame;

public class Car {
    private final Racer name;
    private MoveCount moved;

    public Car(String name) {
        this.name = new Racer(name);
        this.moved = new MoveCount();
    }

    public String getName() {
        return this.name.getName();
    }

    public void go(int no) {
        if (isMoveable(no))
            this.moved.increase();
    }

    private boolean isMoveable(int no) {
        return no > MINIMUN.NUMBER;
    }

    public int getDistance() {
        return this.moved.getCount();
    }

    public String getState() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.getName());
        sb.append(" : ");
        for(int i = 0; i < getDistance(); i++){
            sb.append("-");
        }
        return sb.toString().trim();
    }
}
