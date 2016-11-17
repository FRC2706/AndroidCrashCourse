package ca.team2706.scouting.androidcrashcourse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    String password = "rekt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.onButtonClick(v);
            }
        });

    }

    public void onButtonClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editText3);
        String value = editText.getText().toString();
        if (value.equals(password)) {
            editText.setText ("Correct!");
        }
    }
}