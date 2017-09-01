package it.eliseomartelli.tallymvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements MainView{

    @BindView(R.id.tv)
    TextView mTextView;

    private MainPresenter presenter;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        Model model = new Model();
        presenter = new MainPresenter(this, model);

        presenter.showScore();
    }

    @Override
    public void showCount(int count) {
        mTextView.setText(count+"");
    }

    @OnClick(R.id.button2)
    @Override
    public void addPressed() {
        presenter.addScore();
    }

    @OnClick(R.id.button)
    @Override
    public void removePressed() {
        presenter.removeScore();
    }

    @OnLongClick(R.id.tv)
    @Override
    public boolean resetTriggered() {
        presenter.reset();
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        unbinder = null;
    }
}