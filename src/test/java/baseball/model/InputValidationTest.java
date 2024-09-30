package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("예외 테스트")
class InputValidationTest {

    private InputValidation inputValidation;

    @BeforeEach
    void setUp() {
        inputValidation = new InputValidation();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "12", "1234"})
    void 플레이어_입력_길이_유효성_검증(String input) {
        assertThatThrownBy(() -> inputValidation.validationPlayerInputNumberLength(input)).isInstanceOf(IllegalArgumentException.class);
    }

}