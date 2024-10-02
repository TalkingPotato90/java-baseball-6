package baseball;

import baseball.controller.ExceptionController;
import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameController gameController = new GameController();
        ExceptionController exceptionController = new ExceptionController();

        int replay = 0;

        gameController.startControl();

        while (replay != 2) {
            gameController.printRequireInputControl();
            gameController.compare();
            gameController.endGame();
            replay = exceptionController.inputReplayNumberControl();
        }

    }
}
