package blackjack.domain.rule;

import java.util.Arrays;

public enum PlayerAnswer {

    Y,
    N;

    public static PlayerAnswer of(String answer) {
        return valueOf(answer.toUpperCase());
    }

    public boolean isYes() {
        return this == Y;
    }
}

