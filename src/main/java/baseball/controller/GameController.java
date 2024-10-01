package baseball.controller;

import baseball.view.OutputView;

public class GameController {
    public void startControl(){
        OutputView outputView = new OutputView();

        outputView.printStart();
    }

}
