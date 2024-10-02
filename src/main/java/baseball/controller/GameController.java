package baseball.controller;

import baseball.model.Game;
import baseball.view.OutputView;

import java.util.List;

public class GameController {
    private OutputView outputView = new OutputView();
    private Game game = new Game();
    private ExceptionController exceptionController = new ExceptionController();

    public void startControl(){
        outputView.printStart();
    }

    public void printRequireInputControl(){
        outputView.printRequireInput();
    }

    public void compare(){
        List<Integer> computer = game.pickRandomNumber();
        String result = "";
        while (!result.equals("3스트라이크")) {
            result = game.compareNumber(computer, exceptionController.inputGameNumberControl());
            System.out.println(result);
        }
    }

    public void endGame(){
        outputView.printEnd();
    }

}
