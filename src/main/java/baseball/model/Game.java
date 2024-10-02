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

        if (computer.equals(player)) {
            return "3스트라이크";
        }

        return "2스트라이크";
    }


}
