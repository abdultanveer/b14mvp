package b14.rjt.com.myapplication.ui.main;

import android.view.View;

import b14.rjt.com.myapplication.data.database.model.TodoNote;

/**
 *  view -> presenter
 */
public interface IPresenter {
    public  void onButtonClicked(View view, TodoNote todoNote);

}
