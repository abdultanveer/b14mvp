package b14.rjt.com.myapplication.data;

import b14.rjt.com.myapplication.data.database.DbHelper;
import b14.rjt.com.myapplication.data.database.IDbHelper;

public class DataManager implements  IDataManager{

    IDbHelper dbHelper;
    public DataManager() {
        dbHelper = new DbHelper();
    }

    @Override
    public void createRow() {

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
