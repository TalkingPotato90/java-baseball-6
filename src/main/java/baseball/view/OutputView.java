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
}
