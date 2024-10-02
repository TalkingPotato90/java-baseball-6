package baseball.controller;

import baseball.view.OutputView;

public class GameController {
    private OutputView outputView = new OutputView();

    public void startControl(){
        outputView.printStart();
    }

    public void printRequireInputControl(){
        outputView.printRequireInput();
    }

}
