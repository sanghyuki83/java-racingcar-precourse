package racinggame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Racers  implements Iterable<Racer> {
    private List<Racer> list;

    public Racers(List<String> list) {
        this.list = new ArrayList<>();
        for(String name : list){
            this.list.add(new Racer(name));
        }
    }

    @Override
    public Iterator<Racer> iterator() {
        return this.list.iterator();
    }

    @Override
    public void forEach(Consumer<? super Racer> action) {
        this.list.forEach(action);
    }

    @Override
    public Spliterator<Racer> spliterator() {
        return this.list.spliterator();
    }
}
