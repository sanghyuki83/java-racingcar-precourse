package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;
    @BeforeEach
    void setUp() {
        car = new Car(new Racer("test"));
    }

    @Test
    void 이름확인테스트() {
        assertThat(car.getName()).isEqualTo("test");
    }

    @Test
    void 이동테스트() {
        car.go(3);
        assertThat(car.getDistance()).isEqualTo(0);
        car.go(4);
        assertThat(car.getDistance()).isEqualTo(1);
        car.go(9);
        assertThat(car.getDistance()).isEqualTo(2);
    }

    @Test
    void 출력테스트() {
        car.go(3);
        assertThat(car.getState()).isEqualTo("test : ");
        car.go(4);
        assertThat(car.getState()).isEqualTo("test : -");
    }
}
