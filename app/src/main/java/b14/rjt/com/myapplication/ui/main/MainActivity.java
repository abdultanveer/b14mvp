package b14.rjt.com.myapplication.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import b14.rjt.com.myapplication.R;

/**
 * here mainactivity is my view
 */
public class MainActivity extends AppCompatActivity implements IView, View.OnClickListener {

    IPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
        Button mButton = findViewById(R.id.changeTextBt);
        mButton.setOnClickListener(this);
    }

   /* public void clickHandler(View view) {
        //let my view tell the presenter that an event [button click]
        // happened to the presenter
        presenter.onButtonClicked(view);

        *//*EditText editText = findViewById(R.id.editTextUserInput);
        String name = editText.getText().toString();
        TextView result = findViewById(R.id.textToBeChanged);
        result.setText(name);*//*
    }
*/

    @Override
    public void showToast() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        presenter.onButtonClicked(view);
    }
}
