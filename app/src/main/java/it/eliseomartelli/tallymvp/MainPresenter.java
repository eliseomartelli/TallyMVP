package it.eliseomartelli.tallymvp;

/**
 * Created by Eliseo Martelli on 01-Sep-17.
 */
class MainPresenter {

    private final MainView view;
    private final MainModel model;

    MainPresenter(MainView view, MainModel model) {
        this.view = view;
        this.model = model;
    }

    void addScore() {
        model.addScore();
        showScore();
    }

    void removeScore() {
        model.removeScore();
        showScore();
    }

    void showScore() {
        view.showCount(model.getScore());
    }

    void reset() {
        model.reset();
        showScore();
    }

}
