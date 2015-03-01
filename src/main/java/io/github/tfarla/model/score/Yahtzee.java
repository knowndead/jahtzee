package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class Yahtzee implements Bottom {
    private Dice dices[];

    public Yahtzee(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        return Points.YAHTZEE.get();
    }
}
