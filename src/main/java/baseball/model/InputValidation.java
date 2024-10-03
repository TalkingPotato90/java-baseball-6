package baseball.model;

import baseball.util.Message;

import java.util.List;

public class InputValidation {

    public void validatePlayerInputNumberLength(List<Integer> playerNumber) {

        if (playerNumber.size() != 3) {
            throw new IllegalArgumentException(Message.LENGTH_ERROR.getMent());
        }
    }

    public void validatePlayerInputNumberDuplication(List<Integer> playerNumber) {
        List<Integer> distinctList = playerNumber.stream()
                .distinct()
                .toList();

        if (distinctList.size() != 3) {
            throw new IllegalArgumentException(Message.DUPLICATION_ERROR.getMent());
        }
    }

    public void validatePlayerInputNumberFormat(List<Integer> playerNumber) {
        if (!playerNumber.stream().allMatch(integer -> integer >= 1 && integer <= 9)) {
            throw new IllegalArgumentException(Message.FORMAT_ERROR.getMent());
        }
    }

    public void validateReplayGame(int input) {
        if (input != 1 && input != 2) {
            throw new IllegalArgumentException(Message.REPLAY_ERROR.getMent());
        }
    }
}
