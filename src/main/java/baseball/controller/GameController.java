package baseball.controller;

import baseball.model.Game;
import baseball.view.OutputView;

import java.util.List;

public class GameController {
    private OutputView outputView = new OutputView();
    private Game game = new Game();
    private ExceptionController exceptionController = new ExceptionController();

    public void startControl() {
        outputView.printMessage("숫자 야구 게임을 시작합니다.");
    }

    public void printRequireInputControl() {
        outputView.printMessage("숫자를 입력해주세요 : ");
    }

    public void compare() {
        List<Integer> computer = game.pickRandomNumber();
        String result = "";
        while (!result.equals("3스트라이크")) {
            result = game.compareResult(game.calculateCount(computer, exceptionController.inputGameNumberControl()));
            outputView.printMessage(result);
        }
    }

    public void endGame() {
        outputView.printEnd();
    }

}
