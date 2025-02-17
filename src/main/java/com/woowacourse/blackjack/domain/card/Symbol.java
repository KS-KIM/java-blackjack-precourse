package com.woowacourse.blackjack.domain.card;

/**
 * 카드의 점수를 의미하는 열거형
 *
 * @version 1.0.0
 * @author KSKIM
 * @since 2019-12-15
 */
public enum Symbol {
    ACE(1, "A"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(10, "J"),
    QUEEN(10, "Q"),
    KING(10, "K");

    private int score;
    private String name;

    Symbol(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name;
    }
}
