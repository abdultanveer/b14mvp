package b14.rjt.com.myapplication.data;

import android.content.Context;

import b14.rjt.com.myapplication.data.database.DbHelper;
import b14.rjt.com.myapplication.data.database.IDbHelper;
import b14.rjt.com.myapplication.data.database.model.TodoNote;

public class DataManager implements  IDataManager{

    IDbHelper dbHelper;
    public DataManager(Context context) {
        dbHelper = new DbHelper(context);
    }



    @Override
    public void createRow(String title, String subTitle) {

    }

    @Override
    public void createRow(TodoNote todoNote) {
        dbHelper.createRow(todoNote);

    }

    @Override
    public void readRow(OnResponseListener listener) {
        dbHelper.readRow(listener);

    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
