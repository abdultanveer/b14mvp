package b14.rjt.com.myapplication.ui.main;

import android.view.View;

import b14.rjt.com.myapplication.R;
import b14.rjt.com.myapplication.data.DataManager;
import b14.rjt.com.myapplication.data.IDataManager;
import b14.rjt.com.myapplication.data.database.model.TodoNote;

public class Presenter implements IPresenter,IDataManager.OnResponseListener { //wiring-connection
    IView view;
    IDataManager dataManager;
    public Presenter(MainActivity mainActivity) {
        view = mainActivity;
        dataManager = new DataManager(mainActivity);
    }

    @Override
    public void onButtonClicked(View v, TodoNote todoNote) {
        switch (v.getId()){
            case R.id.buttonPutDb:
                dataManager.createRow(todoNote);
                break;
            case R.id.buttonGetDb:
                dataManager.readRow(this);// obj switchboard
                /*dataManager.readRow(new IDataManager.OnResponseListener() {
                    @Override
                    public void getTodoNote(String todonote) {
                        view.showToast(todonote);
                    }
                });*/
                break;
        }
    }

    @Override
    public void getTodoNote(String todonotestring) {
        view.showToast(todonotestring);

    }

    @Override
    public void getTodoNote(TodoNote todonote) {

    }
}
