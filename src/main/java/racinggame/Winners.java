package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private List<String> list;

    public Winners() {
        list = new ArrayList<>();
    }

    public void clear() {
        list.clear();
    }

    public void add(String name) {
        list.add(name);
    }

    public String get(int idx) {
        return list.get(idx);
    }
}
