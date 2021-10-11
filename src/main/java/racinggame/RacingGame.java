package racinggame;

public class RacingGame {
    private static final RacingGame game = new RacingGame();
    private static final Interface io = Interface.getInstance();

    private RacingGame() {}

    public static RacingGame getInstance() { return game; }

    public void gameStart(){
        Racers racers = io.getPlayers();
        Race race = new Race (racers);
        int planCount = io.getPlayCount();

        playGame(race, planCount);
    }


    private void playGame(Race race, int count) {
        io.printRunningMessage();
        while (count-- > 0){
            race.play(io.getOperation(race.getNumberOfCars()));
            io.printStatus(race);
        }
    }
}
