package baseball.model;

import baseball.util.Message;
import baseball.util.Value;

import java.util.List;

public class InputValidation {

    public void validatePlayerInputNumberLength(List<Integer> playerNumber) {

        if (playerNumber.size() != Value.CORRECT_SIZE.getValue()) {
            throw new IllegalArgumentException(Message.LENGTH_ERROR.getMent());
        }
    }

    public void validatePlayerInputNumberDuplication(List<Integer> playerNumber) {
        List<Integer> distinctList = playerNumber.stream()
                .distinct()
                .toList();

        if (distinctList.size() != Value.CORRECT_SIZE.getValue()) {
            throw new IllegalArgumentException(Message.DUPLICATION_ERROR.getMent());
        }
    }

    public void validatePlayerInputNumberFormat(List<Integer> playerNumber) {
        if (!playerNumber.stream().allMatch(integer -> integer >= Value.MIN_NUMBER.getValue() && integer <= Value.MAX_NUMBER.getValue())) {
            throw new IllegalArgumentException(Message.FORMAT_ERROR.getMent());
        }
    }

    public void validateReplayGame(int input) {
        if (input != Value.REPLAY.getValue() && input != Value.EXIT_GAME.getValue()) {
            throw new IllegalArgumentException(Message.REPLAY_ERROR.getMent());
        }
    }
}
