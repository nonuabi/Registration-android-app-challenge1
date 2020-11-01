package nonu.company.registrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_2);
    }
    public void onClickButton(View view) {
        TextView textView = findViewById(R.id.tvname);
        EditText editTextName = findViewById(R.id.etname);
        textView.setText("Name : "+ editTextName.getText().toString());

    }
}