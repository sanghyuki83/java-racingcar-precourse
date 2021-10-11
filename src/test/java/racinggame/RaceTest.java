package racinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {
    @Test
    void 경주생성테스트() {
        Race race = new Race(new Racers(Arrays.asList("pobi","crong","honux")));
        assertThat(race.getNumberOfCars()).isEqualTo(3);
        race = new Race(new Racers(Arrays.asList("pobi","crong")));
        assertThat(race.getNumberOfCars()).isEqualTo(2);
    }

    @Test
    void 자동차이동테스트() {
        Race race = new Race(new Racers(Arrays.asList("pobi","crong")));
        race.play(Arrays.asList(5,2));
        assertThat(race.getCar("pobi").getDistance()).isEqualTo(1);
        assertThat(race.getCar("crong").getDistance()).isEqualTo(0);
        race.play(Arrays.asList(3,2));
        assertThat(race.getCar("pobi").getDistance()).isEqualTo(1);
        assertThat(race.getCar("crong").getDistance()).isEqualTo(0);
        race.play(Arrays.asList(9,9));
        assertThat(race.getCar("pobi").getDistance()).isEqualTo(2);
        assertThat(race.getCar("crong").getDistance()).isEqualTo(1);
    }

    @Test
    void 우승자확인테스트() {
        Race race = new Race(new Racers(Arrays.asList("pobi","crong")));
        race.play(Arrays.asList(5,2));
        race.play(Arrays.asList(3,2));
        race.play(Arrays.asList(9,9));
        assertThat(race.getWinners().get(0)).isEqualTo("pobi");
        race.play(Arrays.asList(1,9));
        assertThat(race.getWinners().get(0)).isEqualTo("pobi");
        assertThat(race.getWinners().get(1)).isEqualTo("crong");
        race.play(Arrays.asList(1,9));
        assertThat(race.getWinners().get(0)).isEqualTo("crong");

    }

}
