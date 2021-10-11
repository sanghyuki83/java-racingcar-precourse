package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacerTest {
    @Test
    void 이름유효성검사테스트() {
        assertThat(Racer.isValidName("1")).isTrue();
        assertThat(Racer.isValidName("12345")).isTrue();
        assertThat(Racer.isValidName("")).isFalse();
        assertThat(Racer.isValidName("123450")).isFalse();
    }

    @Test
    void 이름확인테스트() {
        Racer racer = new Racer("test");
        assertThat(racer.getName()).isEqualTo("test");
    }
}
