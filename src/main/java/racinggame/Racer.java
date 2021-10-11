package racinggame;

public class Racer {
    private final String name;

    public Racer(String name){
        this.name = name;
    }

    public static boolean isValidName(String racer) {
        return racer.length() > 0 && racer.length() < 6;
    }

    public String getName() {
        return this.name;
    }
}
