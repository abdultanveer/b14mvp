package b14.rjt.com.myapplication.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import b14.rjt.com.myapplication.R;
import b14.rjt.com.myapplication.data.database.model.TodoNote;

/**
 * here mainactivity is my view
 */
public class MainActivity extends AppCompatActivity implements IView {

    IPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
    }

    public void clickHandler(View view) {
        //let my view tell the presenter that an event [button click]
        // happened to the presenter



        /*TextView result = findViewById(R.id.textToBeChanged);
        result.setText(name);*/
        switch (view.getId()){
            case R.id.buttonGetDb:
                presenter.onButtonClicked(view,null);
                break;
            case R.id.buttonPutDb:
                EditText titleeditText = findViewById(R.id.edittextTitle);
                String title = titleeditText.getText().toString();

                EditText subtitleeditText = findViewById(R.id.edittextTitle);
                String subtitle = subtitleeditText.getText().toString();
                TodoNote todoNote = new TodoNote(title,subtitle);
                presenter.onButtonClicked(view,todoNote);

                break;
        }

    }


    @Override
    public void showToast(String todonote) {
        TextView resTextView = findViewById(R.id.textToBeChanged);
        resTextView.setText(todonote);
        Toast.makeText(this, todonote, Toast.LENGTH_SHORT).show();
    }


}
