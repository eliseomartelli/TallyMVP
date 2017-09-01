package it.eliseomartelli.tallymvp;

/**
 * Created by Eliseo Martelli on 01-Sep-17.
 */
class TallyPresenter {

    private final ITallyView view;
    private final ITallyModel model;

    TallyPresenter(ITallyView view, ITallyModel model) {
        this.view = view;
        this.model = model;
    }

    void increaseCount() {
        model.increaseCount();
        showCount();
    }

    void decreaseCount() {
        model.decreaseCount();
        showCount();
    }

    void showCount() {
        view.showCount(model.getCount());
    }

    void resetCount() {
        model.resetCount();
        showCount();
    }

}
