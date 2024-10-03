package baseball.model;

import baseball.util.Message;
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

        return computer;
    }

    public int[] calculateCount(List<Integer> computer, List<Integer> player) {
        int strikeCount = 0;
        int ballCount = 0;

        int[] counts = new int[2];

        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).equals(player.get(i))) {
                strikeCount++;
            } else if (computer.contains(player.get(i))) {
                ballCount++;
            }
        }

        counts[0] = strikeCount;
        counts[1] = ballCount;

        return counts;
    }

    public String compareResult(int[] counts) {
        int strikeCount = counts[0];
        int ballCount = counts[1];

        String result = Message.NOTHING.getMent();

        if (strikeCount != 0 && ballCount != 0) {
            result = ballCount + Message.BALL.getMent() + " " + strikeCount + Message.STRIKE.getMent();
        } else if (strikeCount >= 1) {
            result = strikeCount + Message.STRIKE.getMent();
        } else if (ballCount >= 1) {
            result = ballCount + Message.BALL.getMent();
        }

        return result;
    }

}
