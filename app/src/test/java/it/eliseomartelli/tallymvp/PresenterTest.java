package it.eliseomartelli.tallymvp;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Eliseo Martelli on 01-Sep-17.
 */

public class PresenterTest {
    @Test
    public void isShowingScore() {
        ModelMock modelMock = new ModelMock();
        ViewMock viewMock = new ViewMock();
        MainPresenter presenter = new MainPresenter(viewMock, modelMock);

        presenter.showScore();

        Assert.assertEquals(0, viewMock.count);
    }

    private class ModelMock implements MainModel {
        @Override
        public int getScore() {
            return 0;
        }

        @Override
        public void addScore() {
        }

        @Override
        public void removeScore() {
        }

        @Override
        public void reset() {

        }
    }

    private class ViewMock implements MainView {

        int count;

        @Override
        public void showCount(int count) {
            this.count = count;
        }

        @Override
        public void addPressed() {

        }

        @Override
        public void removePressed() {

        }

        @Override
        public boolean resetTriggered() {
            return false;
        }
    }
}
