package b14.rjt.com.myapplication.ui.main;

import android.view.View;

import b14.rjt.com.myapplication.R;
import b14.rjt.com.myapplication.data.DataManager;
import b14.rjt.com.myapplication.data.IDataManager;

public class Presenter implements IPresenter,IDataManager.OnResponseListener { //wiring-connection
    IView view;
    IDataManager dataManager;
    public Presenter(MainActivity mainActivity) {
        view = mainActivity;
        dataManager = new DataManager();
    }

    @Override
    public void onButtonClicked(View v) {
        switch (v.getId()){
            case R.id.buttonPutDb:
                break;
            case R.id.buttonGetDb:
                dataManager.readRow(this);// obj switchboard
                break;
        }
    }

    @Override
    public void getTodoNote(String todonote) {
        view.showToast(todonote);

    }
}
