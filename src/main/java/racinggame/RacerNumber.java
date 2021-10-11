package racinggame;

import java.util.HashMap;
import java.util.Map;

public class RacerNumber {
    private Map<String, Integer> map;

    public RacerNumber() {
        map = new HashMap<>();
    }

    public void put(String racer, int idx) {
        map.put(racer, idx);
    }

    public int get(String racer) {
        return map.get(racer);
    }
}
