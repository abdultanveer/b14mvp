package b14.rjt.com.myapplication.data.database;

import b14.rjt.com.myapplication.data.IDataManager;

public interface IDbHelper {

    public void createRow();
    public void readRow(IDataManager.OnResponseListener listener);
    public void updateRow();
    public void deleteRow();
}
