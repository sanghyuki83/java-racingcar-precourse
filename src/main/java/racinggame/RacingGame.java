package racinggame;

import java.util.List;

public class RacingGame {
    private static final RacingGame game = new RacingGame();
    private static final Interface io = Interface.getInstance();

    private RacingGame() {}

    public static RacingGame getInstance() { return game; }

    public void gameStart(){
        List<String> racers = io.getPlayers();
    }
}
