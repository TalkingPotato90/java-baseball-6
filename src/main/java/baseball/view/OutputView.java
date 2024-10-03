package baseball.view;

public class OutputView {

    public void printEnd(){
        String end = "3개의 숫자를 모두 맞히셨습니다! ";
        String endGame = "게임 종료";
        String replay = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

        System.out.print(end);
        System.out.println(endGame);
        System.out.println(replay);
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
