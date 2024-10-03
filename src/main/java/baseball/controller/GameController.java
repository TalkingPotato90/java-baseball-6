package baseball.controller;

import baseball.model.Game;
import baseball.util.Message;
import baseball.view.OutputView;

import java.util.List;

public class GameController {
    private OutputView outputView = new OutputView();
    private Game game = new Game();
    private ExceptionController exceptionController = new ExceptionController();

    public void startControl() {
        outputView.printMessage(Message.START.getMent());
    }

    public void printRequireInputControl() {
        outputView.printMessage(Message.INPUT_NUMBER.getMent());
    }

    public void compare() {
        List<Integer> computer = game.pickRandomNumber();
        String result = "";
        while (!result.equals(Message.END_POINT.getMent())) {
            result = game.compareResult(game.calculateCount(computer, exceptionController.inputGameNumberControl()));
            outputView.printMessage(result);
        }
    }

    public void endGame() {
        outputView.printEnd();
    }

}
