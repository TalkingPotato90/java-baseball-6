package baseball.view;

public class OutputView {
    public void printStart(){
        String start = "숫자 야구 게임을 시작합니다.";
        System.out.println(start);
    }

    public void printRequireInput(){
        String message = "숫자를 입력해주세요 : ";
        System.out.print(message);
    }

    public void printEnd(){
        String end = "3개의 숫자를 모두 맞히셨습니다! ";
        String endGame = "게임 종료";
        String replay = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

        System.out.print(end);
        System.out.println(endGame);
        System.out.println(replay);
    }

    public void printGameResult(String result){
        System.out.println(result);
    }
}
