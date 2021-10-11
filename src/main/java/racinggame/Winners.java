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

    public String getWinners(){
        if(list.size() == 0) {
            return "";
        }
        if(list.size() == 1) {
            return list.get(0);
        }
        return makeList();
    }

    private String makeList() {
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        for (int i = 1; i < list.size(); i++){
            sb.append(",");
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
