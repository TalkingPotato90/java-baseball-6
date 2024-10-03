package baseball.util;

public enum Message {
    START("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER("숫자를 입력해주세요 : "),
    END_POINT("3스트라이크"),
    END("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    REPLAY("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱"),
    LENGTH_ERROR("[ERROR] 입력은 세자리만 가능합니다."),
    DUPLICATION_ERROR("[ERROR] 중복된 숫자는 입력할 수 없습니다."),
    FORMAT_ERROR("[ERROR] 1-9사이의 숫자만 입력 가능합니다."),
    REPLAY_ERROR("[ERROR] 1 과 2 만 입력가능합니다.");

    private String ment;

    private Message(String ment) {
        this.ment = ment;
    }

    public String getMent() {
        return ment;
    }
}
