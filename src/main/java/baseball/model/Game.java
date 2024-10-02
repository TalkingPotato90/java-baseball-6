package baseball.model;

import baseball.controller.ExceptionController;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private ExceptionController exceptionController = new ExceptionController();

    public List<Integer> pickRandomNumber() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }

    public String compareNumber(List<Integer> computer, List<Integer> player){
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).equals(player.get(i))) {
                strikeCount++;
            }else if (computer.contains(player.get(i))) {
                ballCount++;
            }
        }

        if (strikeCount >= 1) {
            return strikeCount + "스트라이크";
        }

        if (ballCount >= 1) {
            return ballCount + "볼";
        }

        return "노스트라이크";
    }


}
