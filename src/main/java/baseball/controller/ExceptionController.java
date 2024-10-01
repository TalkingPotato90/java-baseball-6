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
            inputValidation.validatePlayerInputNumberLength(validNumbers);
            inputValidation.validatePlayerInputNumberDuplication(validNumbers);
            inputValidation.validatePlayerInputNumberFormat(validNumbers);
        } catch (Exception e) {
            if(e.getMessage().contains("길이")) {
                System.out.println("[ERROR] 잘못된 길이의 입력으로 어플리케이션을 종료합니다.");
            }else if(e.getMessage().contains("중복")){
                System.out.println("[ERROR] 중복된 입력으로 어플리케이션을 종료합니다.");
            }else if(e.getMessage().contains("1-9")){
                System.out.println("[ERROR] 잘못된 형식의 입력으로 어플리케이션을 종료합니다.");
            }else{
                e.printStackTrace();
            }
        }

        return validNumbers;
    }
}
