package baseball;

import baseball.model.InputValidation;
import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        InputValidation inputValidation = new InputValidation();

        System.out.println("숫자 야구 게임을 시작합니다.");

        String input = inputView.inputPlayerNumbers();
        inputValidation.validationPlayerInputNumberLength(input);

        System.out.println(input);
    }
}
