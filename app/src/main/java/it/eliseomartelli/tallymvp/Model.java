package it.eliseomartelli.tallymvp;

/**
 * Created by Eliseo Martelli on 01-Sep-17.
 */

public class Model implements MainModel {
    int score;
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void addScore() {
        score += 1;
    }

    @Override
    public void removeScore() {
        score -= 1;
    }

    @Override
    public void reset() {
        score = 0;
    }
}
