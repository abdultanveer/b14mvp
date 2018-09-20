package b14.rjt.com.myapplication.ui.categories;

import java.util.List;

import b14.rjt.com.myapplication.data.network.model.Category;

public interface ICategoryView {

    void showCategoriesList(List<Category> categoryList);
}
