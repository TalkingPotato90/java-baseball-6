package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("예외 테스트")
class InputValidationTest {

    private InputValidation inputValidation;

    @BeforeEach
    void setUp() {
        inputValidation = new InputValidation();
    }

    @ParameterizedTest
    @MethodSource("testLengthStream")
    void 플레이어_입력_길이_유효성_검증(List<Integer> sample) {
        assertThatThrownBy(() -> inputValidation.validatePlayerInputNumberLength(sample))
                .isInstanceOf(IllegalArgumentException.class);
    }

    private static Stream<List<Integer>> testLengthStream() {
        return Stream.of(
                List.of(),
                List.of(1),
                List.of(1, 2),
                List.of(1, 2, 3, 4)
        );
    }

    private static Stream<List<Integer>> testDuplicationStream() {
        return Stream.of(
                List.of(1, 1, 2),
                List.of(1, 2, 2),
                List.of(2, 2, 2)
        );
    }

    private static Stream<List<Integer>> testFormatStream() {
        return Stream.of(
                List.of(0, 1, 2),
                List.of(10, 2, 3),
                List.of(2, 3, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testDuplicationStream")
    void 플레이어_입력_중복_유효성_겁증(List<Integer> sample) {
        assertThatThrownBy(() -> inputValidation.validatePlayerInputNumberDuplication(sample))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @MethodSource("testFormatStream")
    void 플레이어_입력_숫자_유효성_겁증(List<Integer> sample) {
        assertThatThrownBy(() -> inputValidation.validatePlayerInputNumberFormat(sample))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,3,10})
    void 게임_재시작_입력_유효성_검증(int inputNumber){
        assertThatThrownBy(()->inputValidation.validateReplayGame(inputNumber))
                .isInstanceOf(IllegalArgumentException.class);
    }

}