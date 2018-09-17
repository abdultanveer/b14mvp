package b14.rjt.com.myapplication.data.database;

import b14.rjt.com.myapplication.data.IDataManager;
import b14.rjt.com.myapplication.data.database.model.TodoNote;

public interface IDbHelper {

    public void createRow(String title, String subTitle);
    public void createRow(TodoNote todoNote);

    public void readRow(IDataManager.OnResponseListener listener);
    public void updateRow();
    public void deleteRow();
}
