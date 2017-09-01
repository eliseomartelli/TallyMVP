package it.eliseomartelli.tallymvp;

/**
 * Created by Eliseo Martelli on 01-Sep-17.
 */

public interface MainView {
    void showCount(int count);
    void addPressed();
    void removePressed();
    boolean resetTriggered();
}
