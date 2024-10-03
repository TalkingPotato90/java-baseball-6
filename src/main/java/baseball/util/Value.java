package baseball.util;

public enum Value {
    DEFAULT(0),
    MIN_NUMBER(1),
    MAX_NUMBER(9),
    CORRECT_SIZE(3),
    REPLAY(1),
    EXIT_GAME(2);

    private final int value;

    private Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
