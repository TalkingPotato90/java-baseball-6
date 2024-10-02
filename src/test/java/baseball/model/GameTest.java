package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

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

    private static Stream<Arguments> allStrikeTest() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), List.of(1, 2, 3)),
                Arguments.of(List.of(5, 1, 3), List.of(5, 1, 3)),
                Arguments.of(List.of(6, 9, 1), List.of(6, 9, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("allStrikeTest")
    void 삼_스트라이크_테스트(List<Integer> computer, List<Integer> player) {
        assertThat(game.compareNumber(computer,player)).isEqualTo("3스트라이크");
    }

}