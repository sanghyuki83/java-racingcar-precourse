package racinggame;

import java.util.List;

public class Race {
    private final Cars carList;
    private final Winners winnerList;
    private final RacerNumber racerNumber;

    private Race(){
        carList = new Cars();
        racerNumber = new RacerNumber();
        winnerList = new Winners();
    }

    public Race(Racers racers) {
        this();

        int sequence = 0;
        for(Racer racer : racers ){
            racerNumber.put(racer.getName(), sequence++);
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

    public Winners getWinners() {
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

    public Cars getCars() {
        return carList;
    }
}
