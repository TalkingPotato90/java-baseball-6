package baseball.controller;

import baseball.model.InputValidation;
import baseball.view.InputView;

import java.util.List;

public class ExceptionController {
    public List<Integer> inputControl() {
        InputView inputView = new InputView();
        InputValidation inputValidation = new InputValidation();

        List<Integer> validNumbers = inputView.inputPlayerNumbers();

        try {
            inputValidation.validatePlayerInputNumberFormat(validNumbers);
            inputValidation.validatePlayerInputNumberDuplication(validNumbers);
            inputValidation.validatePlayerInputNumberLength(validNumbers);
        } catch (Exception e) {
            System.out.println("[ERROR] 잘못된 입력으로 어플리케이션을 종료합니다.");
        }

        return validNumbers;
    }
}
