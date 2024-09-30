package baseball.model;

public class InputValidation {

    public void validationPlayerInputNumberLength(String playerNumber) {
        if (playerNumber.length() != 3) {
            throw new IllegalArgumentException("길이 오류");
        }
    }
}
