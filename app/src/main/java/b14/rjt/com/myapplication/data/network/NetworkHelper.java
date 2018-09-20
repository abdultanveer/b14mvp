package b14.rjt.com.myapplication.data.network;

import java.util.List;

import b14.rjt.com.myapplication.data.IDataManager;
import b14.rjt.com.myapplication.data.network.model.Category;

public class NetworkHelper implements INetworkHelper {



    @Override
    public void getCategories(IDataManager.OnCategoriesListener categoriesListener) {
        // perform the volley n/w call
        //parse the json
        // return a list of category objects
        List<Category> categoryList =null;
        categoriesListener.getCategories(categoryList);
    }
}
