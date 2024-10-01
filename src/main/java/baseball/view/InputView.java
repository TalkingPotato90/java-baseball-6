package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<Integer> inputPlayerNumbers() {
        List<Integer> playerNumbers;
        String[] inputs = Console.readLine().split("");

        playerNumbers = Arrays.stream(inputs)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return playerNumbers;
    }
}
