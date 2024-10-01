package baseball;

import baseball.controller.ExceptionController;
import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameController gameController = new GameController();
        ExceptionController exceptionController = new ExceptionController();

        gameController.startControl();

        try {
            exceptionController.inputControl();
        }catch (Exception e){
            System.out.println("[ERROR] 입력 오류로 게임을 종료합니다.");
        }



    }
}
