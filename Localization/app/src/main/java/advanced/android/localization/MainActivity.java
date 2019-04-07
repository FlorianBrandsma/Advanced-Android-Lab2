package advanced.android.localization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.edit_text);

        final Button englishBtn = findViewById(R.id.english_button);
        final Button swedishBtn = findViewById(R.id.swedish_button);
        final Button finnishBtn = findViewById(R.id.finnish_button);
        final Button surpriseBtn= findViewById(R.id.surprise_button);

        final TextView textView = findViewById(R.id.text);

        englishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(getString(R.string.english) + " " + editText.getText().toString());
            }
        });

        swedishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(getString(R.string.swedish) + " " + editText.getText().toString());
            }
        });

        finnishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(getString(R.string.finnish) + " " + editText.getText().toString());
            }
        });

        surpriseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(getString(R.string.surprise) + " " + editText.getText().toString());
            }
        });
    }
}
