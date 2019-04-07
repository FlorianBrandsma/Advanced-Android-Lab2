package advanced.android.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ArrayList<String> countries = new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

                LinearLayout btnLayout = new LinearLayout(this);
                btnLayout.setOrientation(LinearLayout.HORIZONTAL);
                btnLayout.setGravity(Gravity.CENTER);
                layout.addView(btnLayout);

                Button addBtn = new Button(this);
                addBtn.setText("Add");
                btnLayout.addView(addBtn);

                Button editBtn = new Button(this);
                editBtn.setText("Edit");
                btnLayout.addView(editBtn);

                Button removeBtn = new Button(this);
                removeBtn.setText("Remove");
                btnLayout.addView(removeBtn);

        final EditText editText = new EditText(this);
        //editText.setLayoutParams();
        layout.addView(editText);

        final ListView listView = new ListView(this);
        layout.addView(listView);

        setContentView(layout);

        final String[] COUNTRIES = new String[]
                {
                        "Afghanistan","Albania","Algeria","American Samoa","Andorra",
                        "Angola","Anguilla","Antarctica","Antigua and Barbuda","Argentina",
                        "Armenia","Aruba","Australia","Austria","Azerbaijan"
                };



        for(String country : COUNTRIES)
                countries.add(country);

        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);

        listView.setAdapter(aa);

        addBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        countries.add(editText.getText().toString());
                        listView.setAdapter(aa);
                }
        });

        removeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        for(int i = 0; i < countries.size(); i++){

                                if(countries.get(i).toLowerCase().contains(editText.getText().toString().toLowerCase())) {

                                        countries.remove(i);
                                        break;
                                }
                        }

                        listView.setAdapter(aa);
                }
        });
    }
}
