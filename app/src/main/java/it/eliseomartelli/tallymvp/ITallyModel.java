package it.eliseomartelli.tallymvp;

/**
 * Created by Eliseo Martelli on 01-Sep-17.
 */

interface ITallyModel {
    int getCount();
    void increaseCount();
    void decreaseCount();
    void resetCount();
}
