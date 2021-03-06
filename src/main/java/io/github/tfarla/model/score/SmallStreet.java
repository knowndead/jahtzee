package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class SmallStreet implements Score {
    private Dice dices[];

    public SmallStreet(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        return Points.SMALL_STREET.get();
    }

    public boolean isBottom() {
        return true;
    }
}
