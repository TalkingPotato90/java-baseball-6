package baseball.controller;

import baseball.model.InputValidation;
import baseball.view.InputView;

import java.util.List;

public class ExceptionController {
    private InputView inputView = new InputView();
    private InputValidation inputValidation = new InputValidation();

    public List<Integer> inputControl() {
        List<Integer> validNumbers = inputView.inputPlayerNumbers();

        inputValidation.validatePlayerInputNumberLength(validNumbers);
        inputValidation.validatePlayerInputNumberDuplication(validNumbers);
        inputValidation.validatePlayerInputNumberFormat(validNumbers);

        return validNumbers;
    }
}
