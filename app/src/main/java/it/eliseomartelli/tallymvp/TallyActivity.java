package it.eliseomartelli.tallymvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.Unbinder;

public class TallyActivity extends AppCompatActivity implements ITallyView {

    @BindView(R.id.tv)
    TextView mTextView;

    private TallyPresenter presenter;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        TallyModel model = new TallyModel();
        presenter = new TallyPresenter(this, model);

        presenter.showCount();
    }

    @Override
    public void showCount(int count) {
        mTextView.setText(count+"");
    }

    @OnClick(R.id.button2)
    @Override
    public void onIncreaseCountTriggered() {
        presenter.increaseCount();
    }

    @OnClick(R.id.button)
    @Override
    public void onDecreaseCountTriggered() {
        presenter.decreaseCount();
    }

    @OnLongClick(R.id.tv)
    @Override
    public boolean onResetCountTriggered() {
        presenter.resetCount();
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        unbinder = null;
    }
}