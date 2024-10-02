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

    private static Stream<Arguments> strikeTest() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), List.of(1, 2, 3), "3스트라이크"),
                Arguments.of(List.of(5, 1, 3), List.of(5, 1, 3), "3스트라이크"),
                Arguments.of(List.of(6, 9, 1), List.of(6, 9, 1), "3스트라이크"),
                Arguments.of(List.of(1, 2, 4), List.of(1, 2, 3), "2스트라이크"),
                Arguments.of(List.of(5, 7, 3), List.of(5, 1, 3), "2스트라이크"),
                Arguments.of(List.of(3, 9, 1), List.of(6, 9, 1), "2스트라이크"),
                Arguments.of(List.of(1, 5, 4), List.of(1, 2, 3), "1스트라이크"),
                Arguments.of(List.of(4, 1, 2), List.of(5, 1, 3), "1스트라이크"),
                Arguments.of(List.of(3, 7, 1), List.of(6, 9, 1), "1스트라이크")
        );
    }

    @ParameterizedTest
    @MethodSource("strikeTest")
    void 스트라이크_테스트(List<Integer> computer, List<Integer> player, String expected) {
        assertThat(game.compareNumber(computer,player)).isEqualTo(expected);
    }

}