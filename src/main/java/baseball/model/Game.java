package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public List<Integer> pickRandomNumber() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        System.out.println(computer);

        return computer;
    }

    public String compareNumber(List<Integer> computer, List<Integer> player){
        int strikeCount = 0;
        int ballCount = 0;

        String result = "낫싱";

        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).equals(player.get(i))) {
                strikeCount++;
            }else if (computer.contains(player.get(i))) {
                ballCount++;
            }
        }

        if(strikeCount != 0 && ballCount != 0){
            result = ballCount+"볼 " + strikeCount + "스트라이크";
        }

        if (strikeCount >= 1) {
            result = strikeCount + "스트라이크";
        }

        if (ballCount >= 1) {
            result = ballCount + "볼";
        }

        return result;
    }


}
