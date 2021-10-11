package racinggame;

public class MoveCount {
    private int count;

    public MoveCount(){
        this.count = 0;
    }

    public void increase() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}
