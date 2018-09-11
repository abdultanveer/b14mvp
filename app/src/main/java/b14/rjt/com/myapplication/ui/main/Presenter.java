package b14.rjt.com.myapplication.ui.main;

import android.view.View;

public class Presenter implements IPresenter {
    IView view;
    public Presenter(MainActivity mainActivity) {
        view = mainActivity;
    }

    @Override
    public void onButtonClicked(View v) {
        view.showToast();
    }
}
