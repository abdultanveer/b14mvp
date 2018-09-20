package b14.rjt.com.myapplication.data;

import android.content.Context;

import b14.rjt.com.myapplication.data.database.DbHelper;
import b14.rjt.com.myapplication.data.database.IDbHelper;
import b14.rjt.com.myapplication.data.database.model.TodoNote;
import b14.rjt.com.myapplication.data.network.INetworkHelper;
import b14.rjt.com.myapplication.data.network.NetworkHelper;

public class DataManager implements  IDataManager{

    IDbHelper dbHelper;
    INetworkHelper networkHelper;
    public DataManager(Context context) {

        dbHelper = new DbHelper(context);
        networkHelper = new NetworkHelper();
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

    @Override
    public void getCategories(OnCategoriesListener categoriesListener) {
        networkHelper.getCategories(categoriesListener);
    }
}
