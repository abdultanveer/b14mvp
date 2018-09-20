package b14.rjt.com.myapplication.data;

import java.util.List;

import b14.rjt.com.myapplication.data.database.IDbHelper;
import b14.rjt.com.myapplication.data.database.model.TodoNote;
import b14.rjt.com.myapplication.data.network.INetworkHelper;
import b14.rjt.com.myapplication.data.network.model.Category;

public interface IDataManager extends IDbHelper, INetworkHelper{

    interface OnResponseListener{ /// switch board
        public void getTodoNote(String todonote);
        public void getTodoNote(TodoNote todonote);
    }

    interface OnCategoriesListener{
        public void getCategories(List<Category> categoryList);
    }
}
