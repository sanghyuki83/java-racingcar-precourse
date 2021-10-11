package racinggame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {
    private final List<Car> carList;
    private final List<String> winnerList;
    private final Map<String, Integer> racerNumber;



    private Race(){
        carList = new ArrayList<>();
        racerNumber = new HashMap<>();
        winnerList = new ArrayList<>();
    }

    public Race(List<String> racers) {
        this();

        int sequence = 0;
        for(String racer : racers ){
            racerNumber.put(racer, sequence++);
            carList.add(new Car(racer));
        }
    }

    public int getNumberOfCars() {
        return carList.size();
    }

    public void play(List<Integer> numbers) {
        for(int i = 0; i < numbers.size(); i++){
            carList.get(i).go(numbers.get(i));
        }
    }

    public Car getCar(String racer) {
        return carList.get(racerNumber.get(racer));
    }

    public List<String> getWinners() {
        int max = setMaxDistance();
        winnerList.clear();
        for (Car car : carList){
            setWinner(max, car);
        }
        return winnerList;
    }

    private void setWinner(int max, Car car) {
        if(car.getDistance() == max) {
            winnerList.add(car.getName());
        }
    }

    private int setMaxDistance() {
        int max = 0;
        for (Car car : carList){
            max = Math.max(max, car.getDistance());
        }
        return max;
    }
}
