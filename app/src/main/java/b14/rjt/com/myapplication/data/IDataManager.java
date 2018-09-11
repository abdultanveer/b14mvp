package b14.rjt.com.myapplication.data;

import b14.rjt.com.myapplication.data.database.IDbHelper;

public interface IDataManager extends IDbHelper{

    interface OnResponseListener{ /// switch board
        public void getTodoNote(String todonote);
    }
}
