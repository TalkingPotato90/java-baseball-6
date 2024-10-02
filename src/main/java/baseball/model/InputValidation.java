package baseball.model;

import java.util.List;

public class InputValidation {

    public void validatePlayerInputNumberLength(List<Integer> playerNumber) {

        if (playerNumber.size() != 3) {
            throw new IllegalArgumentException("길이 오류");
        }
    }

    public void validatePlayerInputNumberDuplication(List<Integer> playerNumber) {
        List<Integer> distinctList = playerNumber.stream()
                .distinct()
                .toList();

        if (distinctList.size() != 3) {
            throw new IllegalArgumentException("숫자 중복");
        }
    }

    public void validatePlayerInputNumberFormat(List<Integer> playerNumber) {
        if (!playerNumber.stream().allMatch(integer -> integer >= 1 && integer <= 9)) {
            throw new IllegalArgumentException("1-9사이의 숫자만 입력 가능");
        }
    }

    public void validateReplayGame(int input){
        if(input != 1 && input != 2){
            throw new IllegalArgumentException("1이나 2만 입력가능");
        }
    }
}
