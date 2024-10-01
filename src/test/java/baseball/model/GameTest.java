package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void 컴퓨터_선택_숫자_자릿수_테스트() {
        assertThat(game.pickRandomNumber()).hasSize(3);
    }

    @Test
    void 컴퓨터_선택_숫자_범위_테스트() {
        assertThat(game.pickRandomNumber()).allMatch(i -> i >= 1 && i <= 9);
    }

}