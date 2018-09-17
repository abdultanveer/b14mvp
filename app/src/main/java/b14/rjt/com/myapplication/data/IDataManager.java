package b14.rjt.com.myapplication.data;

import b14.rjt.com.myapplication.data.database.IDbHelper;
import b14.rjt.com.myapplication.data.database.model.TodoNote;

public interface IDataManager extends IDbHelper{

    interface OnResponseListener{ /// switch board
        public void getTodoNote(String todonote);
        public void getTodoNote(TodoNote todonote);

    }
}
