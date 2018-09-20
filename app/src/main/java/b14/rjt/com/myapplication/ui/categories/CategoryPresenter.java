package b14.rjt.com.myapplication.ui.categories;

import android.content.Context;

import java.util.List;

import b14.rjt.com.myapplication.data.DataManager;
import b14.rjt.com.myapplication.data.IDataManager;
import b14.rjt.com.myapplication.data.network.model.Category;

public class CategoryPresenter implements ICategoryPresenter, IDataManager.OnCategoriesListener {
    IDataManager dataManager;
    ICategoryView view;

   public CategoryPresenter(CategoriesActivity categoriesActivity){
       dataManager = new DataManager(categoriesActivity);
       view = categoriesActivity;
   }

    @Override
    public void onActivityCreated() {
        dataManager.getCategories(this);
    }

    @Override
    public void getCategories(List<Category> categoryList) {
        view.showCategoriesList(categoryList);
    }
}
