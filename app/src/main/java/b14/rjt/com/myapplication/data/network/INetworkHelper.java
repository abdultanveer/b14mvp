package b14.rjt.com.myapplication.data.network;

import b14.rjt.com.myapplication.data.IDataManager;

public interface INetworkHelper {

    public void getCategories(IDataManager.OnCategoriesListener categoriesListener);
}
