package b14.rjt.com.myapplication.data.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import b14.rjt.com.myapplication.data.database.model.TodoContract.TodoEntry;


import b14.rjt.com.myapplication.data.IDataManager;
import b14.rjt.com.myapplication.data.database.model.TodoNote;

public class DbHelper implements IDbHelper{
    private static final String TAG = "DbHelper";
    SQLiteDatabase database;
    DatabaseOpenHelper openHelper;

    public DbHelper(Context context){
        openHelper = new DatabaseOpenHelper(context);
        database = openHelper.getWritableDatabase();
    }

    @Override
    public void createRow(String title, String subTitle) {
        ContentValues values = new ContentValues();
        values.put(TodoEntry.COLUMN_NAME_TITLE,title);
        values.put(TodoEntry.COLUMN_NAME_SUBTITLE,subTitle);
        database.insert(TodoEntry.TABLE_NAME,null,values);
    }

    @Override
    public void createRow(TodoNote todoNote) {
        ContentValues values = new ContentValues();
        values.put(TodoEntry.COLUMN_NAME_TITLE,todoNote.getTitle());
        values.put(TodoEntry.COLUMN_NAME_SUBTITLE,todoNote.getSubTitle());
        database.insert(TodoEntry.TABLE_NAME,null,values);
    }

    @Override
    public void readRow(IDataManager.OnResponseListener listener) {
        //return "sample todo note";
        Cursor cursor = database.query(TodoEntry.TABLE_NAME,null,null,null,null,null,null);
        int titleColumnIndex = cursor.getColumnIndexOrThrow(TodoEntry.COLUMN_NAME_TITLE);
        int subTitleColumnIndex = cursor.getColumnIndexOrThrow(TodoEntry.COLUMN_NAME_SUBTITLE);

        cursor.moveToLast();
        String result = cursor.getString(titleColumnIndex)+"\n"+cursor.getString(subTitleColumnIndex);

        listener.getTodoNote(result);//implementation
        //listener.getTodoNote(new TodoNote(cursor.getString(titleColumnIndex),cursor.getString(subTitleColumnIndex)));

    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
