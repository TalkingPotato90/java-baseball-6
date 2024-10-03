package baseball.view;

import baseball.util.Message;

public class OutputView {

    public void printEnd(){
        System.out.println(Message.END.getMent());
        System.out.println(Message.REPLAY.getMent());
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
