package baseball;

import baseball.controller.ExceptionController;
import baseball.controller.GameController;
import baseball.util.Value;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameController gameController = new GameController();
        ExceptionController exceptionController = new ExceptionController();

        int replay = Value.DEFAULT.getValue();

        gameController.startControl();

        while (replay != Value.EXIT_GAME.getValue()) {
            gameController.printRequireInputControl();
            gameController.compare();
            gameController.endGame();
            replay = exceptionController.inputReplayNumberControl();
        }

    }
}
