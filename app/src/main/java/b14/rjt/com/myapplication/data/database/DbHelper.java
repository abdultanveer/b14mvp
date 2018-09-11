package b14.rjt.com.myapplication.data.database;

import b14.rjt.com.myapplication.data.IDataManager;

public class DbHelper implements IDbHelper{
    @Override
    public void createRow() {

    }

    @Override
    public void readRow(IDataManager.OnResponseListener listener) {
        //return "sample todo note";
        listener.getTodoNote("sample todo note");//implementation

    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
