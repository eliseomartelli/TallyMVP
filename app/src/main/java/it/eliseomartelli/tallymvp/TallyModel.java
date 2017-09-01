package it.eliseomartelli.tallymvp;

/**
 * Created by Eliseo Martelli on 01-Sep-17.
 */

public class TallyModel implements ITallyModel {
    private int score;
    @Override
    public int getCount() {
        return score;
    }

    @Override
    public void increaseCount() {
        score += 1;
    }

    @Override
    public void decreaseCount() {
        score -= 1;
    }

    @Override
    public void resetCount() {
        score = 0;
    }
}
