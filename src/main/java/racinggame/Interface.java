package racinggame;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Interface {
    private static final Interface io = new Interface();

    private Interface() {};

    public static Interface getInstance() { return io; }

    public Racers getPlayers() {
        printStartMessage();
        List<String> racers = makeList(Console.readLine());
        while (!checkValid(racers)){
            printInvaildNameMessage();
            printStartMessage();
            racers = makeList(Console.readLine());
        }
        return new Racers(racers);

    }

    private boolean checkValid(List<String> racers) {
        if (racers.size() == 0)
            return false;

        boolean result = true;
        for (String racer : racers){
            result &= Racer.isValidName(racer);
        }
        return result;
    }

    private List<String> makeList(String input) {
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(input,",");
        while (st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        return list;
    }

    private void printStartMessage() {
        System.out.println(MESSAGE.START_MESSAGE);
    }

    private void printInvaildNameMessage() {
        System.out.println(MESSAGE.INVAILD_NAME_MESSAGE);
    }
}
