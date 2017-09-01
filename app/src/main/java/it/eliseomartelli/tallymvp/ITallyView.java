package it.eliseomartelli.tallymvp;

/**
 * Created by Eliseo Martelli on 01-Sep-17.
 */

public interface ITallyView {
    void showCount(int count);
    void onIncreaseCountTriggered();
    void onDecreaseCountTriggered();
    boolean onResetCountTriggered();
}
