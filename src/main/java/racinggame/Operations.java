package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    private List<Integer> list;

    public Operations(List<Integer> list) {
        this.list = list;
    }

    public Operations() {
        list = new ArrayList<>();
    }

    public int size() {
        return list.size();
    }

    public int get(int idx) {
        return list.get(idx);
    }

    public void add(int no) {
        list.add(no);
    }
}
