package racinggame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Cars implements Iterable<Car>{
    private List<Car> list;

    public Cars() {
        this.list = new ArrayList<Car>();
    }

    public void add(Car car) {
        this.list.add(car);
    }

    public int size() {
        return list.size();
    }

    public Car get(int pos) {
        return list.get(pos);
    }

    @Override
    public Iterator<Car> iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer<? super Car> action) {
        list.forEach(action);
    }

    @Override
    public Spliterator<Car> spliterator() {
        return list.spliterator();
    }
}
