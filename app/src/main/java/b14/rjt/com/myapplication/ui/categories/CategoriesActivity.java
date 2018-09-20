package b14.rjt.com.myapplication.ui.categories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import b14.rjt.com.myapplication.R;
import b14.rjt.com.myapplication.data.network.model.Category;

public class CategoriesActivity extends AppCompatActivity implements ICategoryView {
    ICategoryPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        presenter = new CategoryPresenter(this);
        presenter.onActivityCreated();
    }

    @Override
    public void showCategoriesList(List<Category> categoryList) {

    }
}
